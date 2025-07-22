class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] matrix = new int[n][n];
        int maxValue = 100000;

        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], maxValue);
            matrix[i][i] = 0;
        }

        for (int i = 0; i < edges.length; i++) {
            int node1 = edges[i][0];
            int node2 = edges[i][1];
            int weight = edges[i][2];

            matrix[node1][node2] = weight;
            matrix[node2][node1] = weight;
        }

        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][via] == maxValue || matrix[via][j] == maxValue) continue;
                    matrix[i][j] = Math.min(matrix[i][j], (matrix[i][via] + matrix[via][j]));
                }
            }
        }

        int maxCity = 0;
        int maxThresholds = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currThresholds = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (matrix[i][j] <= distanceThreshold) currThresholds++;
            }
            if(maxThresholds >= currThresholds ){
                maxThresholds = currThresholds;
                maxCity = i;
            }
        }
        return maxCity;
    }
}