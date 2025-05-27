class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;

        int dp[] = new int [n];
        boolean allZero = false;

        for(int i = 0 ; i < n ; i++){
            if(obstacleGrid[0][i] == 1) {
                dp[i] = 0;
                allZero = true;
            }
            else dp[i] = allZero ? 0 : 1;
        }

        for(int i = 1 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(obstacleGrid[i][j] == 1) dp[j] = 0;
                else if(j > 0) dp[j] = dp[j - 1] + dp[j];
            }
        }
        return dp[n - 1];
    }
}