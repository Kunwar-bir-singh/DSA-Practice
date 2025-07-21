// User function Template for Java

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int distance [] = new int [V];
        Arrays.fill(distance, 100000000);
        
        distance[src] = 0;
        
        for(int i = 0 ; i < V ; i++){
            for(int j = 0 ; j < edges.length ; j++){
                int node = edges[j][0];
                int neighbour = edges[j][1];
                int weight = edges[j][2];
                
                 if(distance[node] != 100000000){
                    if(distance[node] + weight < distance[neighbour]){
                        distance[neighbour] = distance[node] + weight; 
                    } 
                }
            }
        }
        
        for(int j = 0 ; j < edges.length ; j++){
                int node = edges[j][0];
                int neighbour = edges[j][1];
                int weight = edges[j][2];
                
                if(distance[node] != 100000000){
                    if(distance[node] + weight < distance[neighbour]){
                    return new int [] {-1}; 
                    }
                    
                }
            }
        return distance;
    }
}
