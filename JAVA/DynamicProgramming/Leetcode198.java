class Solution {
    public int rob(int[] nums) {
        int len = nums.length; 
        
        if (len == 1 ) return nums[0];

        int dp[] = new int [len];
        dp[0] = nums[0];
        dp[1] =  Math.max(nums[1] , nums[0]);

        for(int i = 2 ; i < len ; i++){
            dp[i] = Math.max(( nums[i] + dp[i - 2] ), dp[i - 1] );
        }

        return dp[len - 1];
    }

}