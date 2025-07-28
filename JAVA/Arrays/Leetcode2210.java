class Solution {
    public int countHillValley(int[] nums) {
        Boolean upstream = null;
        int total = 0;

        int i = 1;

        while(upstream == null){
            if(i == nums.length) break;
            if(nums[i - 1] < nums[i]) upstream = true;
            else if(nums[i - 1] > nums[i]) upstream = false;
            i++;
        }

        while(i < nums.length){
            if(nums[i - 1] > nums[i]){
                if(upstream) total++;
                upstream = false;
            }
        else if(nums[i - 1] < nums[i]){
                if(upstream == false) total++;
                upstream = true;
            }
            i++;
        }  
    
    return total;
    }
}