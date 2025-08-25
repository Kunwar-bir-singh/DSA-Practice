class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0;
        int zeroCount = 0;
        
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] == 0) zeroCount++;
            
            while(zeroCount > 1){
                if(nums[i] == 0) zeroCount -= 1;
                i++;
            }
            
            maxLen = Math.max(maxLen, j - i);
            j++;
        }

        return maxLen;
    }
}