class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int currSum = nums[0];

        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] < nums[i + 1]) currSum += nums[i + 1];
            else{
                maxSum = Math.max(maxSum, currSum);
                currSum = nums[i + 1];
            }
        }
        return Math.max(maxSum, currSum);
    }
}