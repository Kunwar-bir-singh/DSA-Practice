class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        boolean [] visited = new boolean [V];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList());   
        }
        
        for(int i = 0 ; i < edges.length ; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        
        for(int node = 0 ; node < V ; node++){
            if(!visited[node]){
                dfs(st, visited, adj, node);
            }
        }
        
        for(int i = 0 ; i < V ;i++){
            ans.add(st.pop());    
        }

        return ans;
    }
    
    public static void dfs(Stack<Integer> st, boolean [] visited, ArrayList<ArrayList<Integer>> adj, int node){
        if(visited[node]) return;
        
        visited[node] = true;
        
        for(Integer itr : adj.get(node)){
            dfs(st, visited, adj, itr);
        }
        st.push(node);
    }
}