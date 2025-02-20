class Solution {
    public boolean isArraySpecial(int[] nums) {
        int len = nums.length;
        for(int i  = 0 ; i < len ; i++){
            if( i == len - 1) return true;

            int pairLeftBit = nums[i] & 1;
            int pairRightBit = nums[i + 1] & 1;

            if(pairLeftBit == pairRightBit) return false;
        }
        return true;
    }
}