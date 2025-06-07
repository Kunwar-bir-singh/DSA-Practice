class Solution {
    public int maxProfit(int[] prices) {

        int len = prices.length;
        int dp[][] = new int[len + 2][3];

        for (int index = len - 1; index >= 0; index--) {
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 1) {
                    int bought = dp[index + 1][0] - prices[index];
                    int skipBuy = dp[index + 1][1];
                     dp[index][buy] = Math.max(bought, skipBuy);
                } else {
                    int sold = dp[index + 2][1] + prices[index];
                    int skipSell = dp[index + 1][0];
                     dp[index][buy] = Math.max(sold, skipSell);
                }
            }
        }

        return dp[0][1];
    }

    public static int dfs(int[] prices, int dp[][], int index, int buy) {
        if (index >= prices.length)
            return 0;

        if (dp[index][buy] != -1)
            return dp[index][buy];

        if (buy == 1) {
            int bought = dfs(prices, dp, index + 1, 0) - prices[index];
            int skipBuy = dfs(prices, dp, index + 1, 1);
            return dp[index][buy] = Math.max(bought, skipBuy);
        } else {
            int sold = dfs(prices, dp, index + 2, 1) + prices[index];
            int skipSell = dfs(prices, dp, index + 1, 0);
            return dp[index][buy] = Math.max(sold, skipSell);
        }
    }
}