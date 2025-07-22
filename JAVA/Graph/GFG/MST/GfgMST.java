class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.

        PriorityQueue<int []> que = new PriorityQueue<>((a,b ) -> Integer.compare(a[1] , b[1]));
        
        boolean [] visited = new boolean [V];
        
        int sum = 0;
        
        que.add(new int []{ 0, 0});
        
        while(!que.isEmpty()){
            int [] min = que.poll();
            int node = min[0];
            int weight = min[1];
            
            if(!visited[node]){
                visited[node] = true;
                sum += weight;
            
            for(int [] children : adj.get(node)){
                int child = children[0];
                int childWeight = children[1];
                que.add(new int [] {child, childWeight});
                }
            }
        }
        
        return sum;
    }
}