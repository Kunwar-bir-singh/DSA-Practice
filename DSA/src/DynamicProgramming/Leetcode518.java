class Solution {
    public int change(int amount, int[] coins) {
        
        int memo[][] =  new int [amount + 1][coins.length];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return  recur( coins, memo, amount, 0);
        
    }
    
    public static int recur( int [] coins, int memo[][], int amount, int index){
        if(amount == 0){
           return 1; 
        }
        if(amount < 0 || index == coins.length) return 0;

        if(memo[amount][index] != -1 ) return memo[amount][index];

        int coinTook = recur(coins, memo, amount - coins[index], index );
        int coinNotTook = recur(coins, memo, amount , index + 1 );

        return memo[amount][index] = coinTook + coinNotTook; 
    }
}