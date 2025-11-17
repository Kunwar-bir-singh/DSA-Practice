class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastOneIndex = 0;
        boolean oneFound = false;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                if(oneFound){
                    if(i - lastOneIndex <= k) return false;
                }
                else{
                    oneFound = true;
                }
                lastOneIndex = i;
            }
        }
        return true;
    }
}