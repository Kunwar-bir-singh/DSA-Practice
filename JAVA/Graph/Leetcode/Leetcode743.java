class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int []>> adj = new ArrayList<>();
        PriorityQueue<int[]> que = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        int visited[] = new int [n];

        for(int i = 0 ; i < n ; i++) adj.add(new ArrayList<>());

        for(int j = 0 ; j < times.length ; j++){
            int node = times[j][0];
            int neighbour = times[j][1];
            int time = times[j][2];

            adj.get(node - 1).add(new int[] {neighbour - 1, time});
        }

        Arrays.fill(visited, Integer.MAX_VALUE);

        que.add(new int [] {k - 1, 0});
        visited[k - 1] = 0;

        while(!que.isEmpty()){
            int pair[] = que.poll();
            int currNode = pair[0];
            int currTime = pair[1];

            for(int nextNode[] : adj.get(currNode)){
                int neighbour = nextNode[0];
                int nextTime = nextNode[1];
                int totalTime = currTime + nextTime;
                if(visited[neighbour] > totalTime){
                    que.add(new int [] {neighbour , totalTime});
                    visited[neighbour] = totalTime;
                }
            }
        }
        int max = 0;
        for(int time : visited){
            if(time == Integer.MAX_VALUE) return -1;
            max = Math.max(time, max);
        }
        return max;
    }
}