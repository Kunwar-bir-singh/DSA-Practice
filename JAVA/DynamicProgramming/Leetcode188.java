class Solution {
    public int maxProfit(int k, int[] prices) {
       int dp[][][] = new int[prices.length + 1][2][k + 1];

        for (int index = prices.length - 1; index >= 0; index--) {
            for (int buy = 0; buy < 2; buy++) {
                for (int trans = 1; trans <= k; trans++) {
                    if (buy == 1) {
                        int bought = dp[index + 1][0][trans] - prices[index];
                        int skipBuy = dp[index + 1][1][trans];
                        dp[index][buy][trans] = Math.max(bought, skipBuy);
                    } else {
                        int sell = dp[index + 1][1][trans - 1] + prices[index];
                        int skipSell = dp[index + 1][0][trans];
                        dp[index][buy][trans] = Math.max(sell, skipSell);
                    }
                }
            }
        }
        return dp[0][1][k];
    }
   
}