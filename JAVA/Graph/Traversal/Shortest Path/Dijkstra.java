class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<int[]>> adj = new ArrayList<>();
         
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[]{v, w});
        }
        
        int visited[] = new int [V];
        Arrays.fill(visited, Integer.MAX_VALUE);
        
        PriorityQueue<int[]> que = new PriorityQueue<>(
        (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
    
        que.add(new int[]{src,0});
        visited[src] = 0;
        
        while(!que.isEmpty()){
            int [] pair = que.poll();
            int currNode = pair[0];
            int currDistance = pair[1];
            
            for(int node[] : adj.get(currNode)){
                int totalDistance =  node[1] + currDistance;
                    
                if(visited[node[0]] > totalDistance){
                    visited[node[0]] = totalDistance;
                    que.add(new int []{node[0], totalDistance});
                
                }
            }
        }
        
        return visited;
    }
}