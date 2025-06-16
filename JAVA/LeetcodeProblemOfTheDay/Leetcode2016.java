class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int currSmallest = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > currSmallest){
                maxDiff = Math.max(maxDiff, nums[i] - currSmallest );
            }
            else currSmallest = nums[i];
        }
        return maxDiff;
    }
}