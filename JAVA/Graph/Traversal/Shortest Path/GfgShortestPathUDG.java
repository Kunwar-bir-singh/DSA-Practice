class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        
        PriorityQueue<int []> que = new PriorityQueue<>((a, b) -> a[0] != b[0] ?
                Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        List<List<int[]>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int [] parent = new int [n];
        int [] distance = new int [n];

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            distance[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        for(int i = 0 ; i < edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            adj.get(u - 1).add(new int [] {v - 1, w });
            adj.get(v - 1).add(new int [] {u - 1, w });

        }


        que.add(new int []{0, 0});
        parent[0] = 0;
        distance[0] = 0;

        while(!que.isEmpty()){
            int pair[] = que.poll();
            int currNode = pair[0];
            int currDistance = pair[1];

            for(int neighbour[] : adj.get(currNode)){
                int totalDistance = currDistance + neighbour[1];
                if(distance[neighbour[0]] > totalDistance){
                    que.add(new int [] {neighbour[0], totalDistance});
                    distance[neighbour[0]] = totalDistance;
                    parent[neighbour[0]] = currNode;
                }
            }
        }

        int pointer = n-1;
        if(parent[pointer] == -1){
            ans.add(-1);
        }else{
            while(parent[pointer] != pointer){
                ans.add(pointer + 1);
                pointer = parent[pointer];
            }
            ans.add(pointer + 1);
            ans.add(distance[n - 1]);
        }
        Collections.reverse(ans);
        return ans;
    }
}