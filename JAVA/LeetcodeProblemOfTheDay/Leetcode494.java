class Solution {
    public int findTargetSumWays(int[] nums, int target) {
     int [] ans = new int[1];

     calculateWays(nums, target, ans, 0, 0, nums.length);

     return ans[0];   
    }

    public static void calculateWays(int [] nums, int target, int [] ans, int sum, int index, int length){
        if(index == length){
            if(sum == target) ans[0]++;
            return;
        }
        calculateWays(nums, target, ans, sum - nums[index], index + 1, length);
        calculateWays(nums, target, ans, sum + nums[index], index + 1, length);
    }
}