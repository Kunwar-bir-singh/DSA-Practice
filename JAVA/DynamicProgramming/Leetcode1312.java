class Solution {
    public int minInsertions(String s) {
        int len = s.length();
        String revString = " ";

        for(int i = 0 ; i < len ; i++){
            revString = s.charAt(i) + revString ; 
        }

        int dp [][] =  new int [len + 1][len + 1];

        for(int i = 1 ; i <= len ; i++){
            for(int j = 1 ; j <= len ; j++){
                if(s.charAt(i - 1) == revString.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];  
                }
                else dp[i][j] = Math.max( dp[i][j - 1],  dp[i - 1][j]);
            }   
        }
        return len - dp[len][len];
    }
}