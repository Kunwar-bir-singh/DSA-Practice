class Solution {
    public int waysToSplitArray(int[] nums) {
        int len = nums.length;

        long leftSum = 0;
        long rightSum = 0;

        int validSplits = 0;

        for(int i = 0 ; i < len ; i++){
            rightSum += (long) nums[i];
        }

        for(int j = 0 ; j < len - 1 ; j++){
            leftSum +=  (long) nums[j];
            rightSum -=  (long) nums[j];

            if(leftSum >= rightSum) validSplits++;
        }
        return validSplits;
    }
}