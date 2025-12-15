class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = prices.length;

        int i = 0;
        int j = 1;

        while (j < prices.length) {
            if (prices[j - 1] - prices[j] == 1)
                ans += j - i;
            else {
                i = j;
            }
            j++;
        }
        return ans;
    }
}