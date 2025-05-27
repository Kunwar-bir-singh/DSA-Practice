public class Solution {
	public static int cutRod(int price[], int n) {
		// Write your code here.
		int dp [][] = new int [n][n + 1];

        for(int i = 0 ; i <= n ; i++){
            dp[0][i] = i * price[0] ;
        }

        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j <= n ; j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if(i + 1 <= j) take = price[i] + dp[i][j - (i + 1)];

                dp[i][j] = Math.max(take, notTake);
            }
        }
        return dp[n - 1][n];
	}
}