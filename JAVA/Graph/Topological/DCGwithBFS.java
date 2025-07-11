class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        int[] inDegree = new int [V];
        
        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList());
        }
        for(int i = 0 ; i < edges.length ; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            inDegree[edges[i][1]]++;
        }
        
       for(int node = 0 ; node < V ; node++) {
            if(inDegree[node ] == 0) que.add(node );
        }

        
        return bfs(V, adj, que, inDegree);
        
    }
    public static boolean bfs(int V, ArrayList<ArrayList<Integer>> adj, Queue<Integer> que, int[] inDegree){
        int len = 0;
        
        while(!que.isEmpty()){
            int curr = que.poll();
            len++;
            
            for(int i = 0 ; i < adj.get(curr).size();i++){
                int neighbour = adj.get(curr).get(i);
                inDegree[neighbour]-- ;
                if(inDegree[neighbour] == 0) que.add(neighbour);
            }
        }
        return len != V;
    }
}   