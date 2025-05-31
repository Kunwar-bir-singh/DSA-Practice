class Solution {
    public int numDistinct(String s, String t) {
        int dp[][] = new int[s.length()][t.length()];

        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }

        return sub(s, t, dp, 0, 0);
    }

    public static int sub(String s, String t, int[][] dp, int index1, int index2) {
        if (index2 == t.length()) {
            return 1;
        }

        if (index1 == s.length()) {
            return 0;
        }

        if (dp[index1][index2] != -1)
            return dp[index1][index2];

        int count = 0;
        if (s.charAt(index1) == t.charAt(index2)) {
            count = sub(s, t, dp, index1 + 1, index2 + 1);
        }

        count += sub(s, t, dp, index1 + 1, index2);

        return dp[index1][index2] = count;
    }
}