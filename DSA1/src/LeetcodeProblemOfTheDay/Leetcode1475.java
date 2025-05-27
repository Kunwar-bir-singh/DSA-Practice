class Solution {
    public int[] finalPrices(int[] prices) {

        Stack <Integer> st = new Stack<>();
        int [] ansArr = new int [prices.length];

        for(int i = 0 ; i < prices.length ; i++){
            
            while(!st.isEmpty() && prices[st.peek()] >= prices[i]){
                int removedIndex = st.pop();
                prices[removedIndex] = prices[removedIndex] - prices[i];
            }
            st.push(i);
        }

        return prices;
    }
}