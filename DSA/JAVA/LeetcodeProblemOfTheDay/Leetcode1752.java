class Solution {
    public boolean check(int[] nums) {
        int flag = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i == nums.length - 1){
                if(nums[i] > nums[0]) flag++;
                break;
            }
            if(nums[i] > nums[i + 1]) flag++;
        }
        return flag > 1 ? false : true;   
    }
}