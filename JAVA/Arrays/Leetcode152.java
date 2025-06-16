class Solution {
    public int maxProduct(int[] nums) {
        int leftMax = -11;
        int rightMax = -11;

        int currLeft = 1;
        int currRight = 1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                currLeft = 1;
                leftMax = Math.max(0, leftMax);
            }
            else{
                currLeft *= nums[i];
                leftMax = Math.max(currLeft, leftMax);
            }
        }

        for(int i = nums.length - 1 ; i >= 0 ; i--){
            if(nums[i] == 0){
                currRight = 1;
                rightMax = Math.max(0, rightMax);

            }
            else{
                currRight *= nums[i];
                rightMax = Math.max(currRight, rightMax);
            }
        }

        return Math.max(leftMax, rightMax);
    }
}