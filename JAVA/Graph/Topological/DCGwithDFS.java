class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean [] visited = new boolean [V];
        boolean [] recurVis = new boolean [V];

        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList());
        }
        
        for(int i = 0 ; i < edges.length ; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }

        for(int i = 0 ; i < V ; i++){
            if(!visited[i]) {
                if (dfs(adj, visited, recurVis, i)) return true;
            }
        }
        
        return false;
    }
    
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean [] visited,
                              boolean [] recurVis, int node){
                                  
        visited[node] = true;
        recurVis[node] = true;

        for(Integer neighbour : adj.get(node)){
            if(!visited[neighbour]){ 
                if(dfs(adj, visited, recurVis, neighbour)) return true;
            }
            else if(recurVis[neighbour]) return true;
        }
        recurVis[node]= false;
        return false;
    }
}       