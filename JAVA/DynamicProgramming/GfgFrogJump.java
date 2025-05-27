class Solution {
    int minCost(int[] height) {
        // code here
    if (height.length == 1) return 0;

    int dp[] = new int [height.length];
    dp[0] = 0;
    dp[1] = Math.abs(height[0] - height[1]);
    
    for(int i = 2 ; i < height.length ; i++){
        dp[i] = Math.min((dp[i - 1] + Math.abs(height[i - 1] - height[i])) , 
        (dp[i - 2] + Math.abs(height[i - 2] - height[i])));
    }
    
    return dp[height.length - 1];
    }
}