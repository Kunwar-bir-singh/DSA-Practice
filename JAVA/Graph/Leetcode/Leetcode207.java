class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        int []inDegree =  new int [numCourses];

        for(int i = 0 ;  i < numCourses ; i++){
            adj.add(new ArrayList());
        }

        for(int i = 0 ; i < prerequisites.length ; i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
            inDegree[prerequisites[i][1]]++;
        }

        for(int node = 0 ; node < numCourses ; node++){
            if(inDegree[node] == 0) que.add(node);
        }

        return bfs(adj, que, inDegree);
    }
    public static boolean bfs(ArrayList<ArrayList<Integer>> adj, Queue<Integer> que, int []inDegree ){
        int length = 0;

        while(!que.isEmpty()){
            int curr = que.poll();
            length++;
            for(Integer neighbour : adj.get(curr)){
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0) que.add(neighbour);
            }
        }
        return length == adj.size();
    }
}