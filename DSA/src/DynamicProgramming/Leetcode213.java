class Solution {
    public int rob(int[] nums) {
        int len = nums.length; 
        
        if (len == 1 ) return nums[0];
        if (len == 2 ) return Math.max(nums[0], nums[1]);

        int dp[] = new int [len];
        int sum1 = 0;
        int sum2 = 0;

        dp[0] = nums[0];
        dp[1] =  Math.max(nums[1] , nums[0]);

        for(int i = 2 ; i < len - 1; i++){
            dp[i] = Math.max(( nums[i] + dp[i - 2] ), dp[i - 1] );
        }
        sum1 = dp[len - 2];

        dp[0] = nums[1];
        dp[1] =  Math.max(nums[2] , nums[1]);

        for(int i = 2 ; i < len - 1; i++){
            dp[i] = Math.max(( nums[i+1] + dp[i - 2] ), dp[i - 1] );
        }
        sum2 = dp[len - 2];

        return Math.max(sum1, sum2);
    }

}