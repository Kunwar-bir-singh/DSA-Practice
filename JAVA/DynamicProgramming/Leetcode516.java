class Solution {
    public int longestPalindromeSubseq(String s) {
        String reverse = "";
        int len = s.length();

        for(int i =0 ; i < len ; i++){
            reverse = s.charAt(i) + reverse;
        }

        int dp[][] = new int[len + 1][len + 1];

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if (s.charAt(i - 1) == reverse.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else
                    dp[i][j] = Math.max(dp[i ][j - 1] , dp[i - 1][j ]);
            }
        }

        return dp[len][len];
    }
}