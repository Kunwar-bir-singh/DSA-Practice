class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue <Integer> queue = new LinkedList<>();
        ArrayList<Integer> bfs =  new ArrayList<>();
        boolean [] visited = new boolean [V + 1];
        
        queue.add(0);
        visited[0] = true;
        
        while(!queue.isEmpty()){
            Integer node = queue.poll();
            bfs.add(node);
            
            for(Integer it : adj.get(node)){
                if(!visited[it]) {
                    
                visited[it] = true;
                queue.add(it);
                } 
            }
        }
        return bfs;
    }
}