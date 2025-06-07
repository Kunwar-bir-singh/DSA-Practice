class Solution {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        int dp[][] = new int[len + 1][3];

        for (int index = len - 1; index >= 0; index--) {
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 1) {
                    int bought = dp[index + 1][0] - prices[index];
                    int skipBuy = dp[index + 1][1];
                     dp[index][buy] = Math.max(bought, skipBuy);
                } else {
                    int sold = dp[index + 1][1] + prices[index] - fee;
                    int skipSell = dp[index + 1][0];
                     dp[index][buy] = Math.max(sold, skipSell);
                }
            }
        }

        return dp[0][1];
    }
}