class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length;
        int dp[][] = new int [len][len];

        for(int i = 0 ; i < len ; i++){
            dp[0][i] = matrix[0][i];
        }

        for(int i = 1 ; i < len  ; i++){
            for(int j = 0 ; j < len ; j++){
                if( j == 0) dp[i][j] = Math.min(dp[i-1][j + 1] , dp[i-1][j]);
                else if(j + 1 ==  len) dp[i][j] = Math.min(dp[i-1][j -1] , dp[i-1][j]);
                else dp[i][j] = Math.min( Math.min(dp[i-1][j + 1] , dp[i-1][j]) , dp[i - 1][j - 1] ) ;
                dp[i][j] += matrix[i][j] ;
            }
        } 
        return Arrays.stream(dp[len - 1]).min().getAsInt();
    }
}