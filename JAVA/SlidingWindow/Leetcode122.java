class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int smallestElem = prices[0];
        int peak = prices[0];

        for(int i = 1 ; i < prices.length; i++){
            if(prices[i] < peak){
                maxProfit += peak - smallestElem;
                peak = prices[i];
                smallestElem = prices[i];
            }
            else{
                peak = prices[i];
            }
        }
        if(peak > smallestElem) maxProfit += peak - smallestElem;
        return maxProfit;
    }
}