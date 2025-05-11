class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int i : nums) totalSum += i;

        if(totalSum % 2 != 0) return false;
        int target = totalSum / 2; 

        boolean []prev = new boolean [target + 1];

        prev[0] = true;
        if(nums[0] <= target )prev[nums[0]] = true;

        for(int i = 1 ; i < nums.length ; i++){
            boolean []curr = new boolean [target + 1];
            for (int sum = 1; sum <= target; sum++) {
            boolean notTake = prev[sum];
            boolean take = false;
            if (nums[i] <= sum) {
                take = prev[sum - nums[i]];
            }
            curr[sum] = take || notTake;
        }
        // prev = curr;
        }

        return prev[target];
    }
}