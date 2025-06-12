class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;

        for(int i = 0  ; i < nums.length ; i++){
            if(i == nums.length - 1){
                maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[0]));
            }
            else maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i+1]));
        }
        return maxDiff;
    }
}