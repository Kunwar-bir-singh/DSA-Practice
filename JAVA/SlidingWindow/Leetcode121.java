class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestStock = 0;

        for(int i = 0 ; i< prices.length ; i++){
            if(prices[i] < prices[bestStock]){
                bestStock = i;
            }
            maxProfit = Math.max(maxProfit, prices[i] - prices[bestStock]);
        }
        return maxProfit;
    }
}