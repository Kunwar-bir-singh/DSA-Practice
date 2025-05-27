class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int flag = 0;
        int maxCount = 1;
        int currCount = 1;

        for(int i = 0 ; i < nums.length - 1 ; i++){
            int diff = nums[i] - nums[i + 1];

            if(diff > 0 ){
                if(flag == 1 || flag == 0) currCount++;
                else{
                    currCount = 2;
                }
               flag = 1;
            }
            else if(diff < 0 ){
                if(flag == -1 || flag == 0) currCount++;
                else{
                    currCount = 2;
                }
               flag = -1;
            }
            else {
                flag = 0;
                currCount = 1;
            }
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }
}