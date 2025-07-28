class Solution {
    // Function to find number of strongly connected components in the graph.
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int ans = 0;
        int len = adj.size();
        
        ArrayList<ArrayList<Integer>> reverse = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        boolean visited[] = new boolean[len];
        
        dfs(adj, visited, st, 0, false);
        
        
        for(int i = 0 ; i < len ; i++){
            reverse.add(new ArrayList());
        }
        
        for(int i = 0; i < len ; i++){
            for(Integer child : adj.get(i)){
                reverse.get(child).add(i);       
            }
        }
      
        System.out.println("Stack : "+ st);
        System.out.println("Reverse : "+ reverse);
        
        visited = new boolean[len];
        
        while(!st.isEmpty()){
            int topNode = st.pop();

            if(!visited[topNode]) {
                ans++;
                dfs(reverse, visited, st, topNode, true);
            }
        }
        return ans;
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean visited[], 
    Stack<Integer> st, Integer node, boolean visit){
        
        if(visited[node]) return;
        
        visited[node] = true;
        
        for(Integer child : adj.get(node)){
             dfs(adj, visited, st, child, visit);
        }
        
        if(!visit) st.add(node);
    }
}