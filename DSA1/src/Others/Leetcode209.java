class Leetcode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int ans =  Integer.MAX_VALUE;
        int sum = 0;
        while(j < nums.length){
            sum += nums[j];
            j++;
            while(sum >= target){
                ans =  Math.min(ans, j - i);
                sum -= nums[i];
                i++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}