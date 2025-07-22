// User function template for JAVA

class Solution {
    public void floydWarshall(int[][] dist) {
        // Code here
        int max = 100000000;
        int len = dist.length;
        
        for(int via = 0 ; via < len ; via++){
            for(int i = 0 ; i < len ; i++){
                for(int j = 0 ; j < len ; j++){
                    if(dist[i][via] == max || dist[via][j] == max) continue;
                    dist[i][j] = Math.min(dist[i][j] , ( dist[i][via] + dist[via][j] ));
                }
            }
        }
    }
}