class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int [][]dp = new int[arr.length][3];
        dp[0] = new int[] {arr[0][0], arr[0][1], arr[0][2]};
        
        for(int i = 1 ; i < arr.length ; i++){
            dp[i] = new int[] { (Math.max(dp[i - 1][1] , dp[i - 1][2]) + arr[i][0] ) ,
                    (Math.max(dp[i - 1][0] , dp[i - 1][2]) + arr[i][1] ),
                    (Math.max(dp[i - 1][0] , dp[i - 1][1]) + arr[i][2] )};
        }
        
        return Arrays.stream(dp[arr.length - 1]).max().getAsInt();
    }
}