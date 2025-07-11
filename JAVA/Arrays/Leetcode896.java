class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = false;
        boolean dec =  false;

        int i = 0;
        int j = 1;

        while(j < nums.length && nums[i] == nums[j]){
            i++;
            j++;
        }

        if(j < nums.length && nums[i] < nums[j]) inc = true;
        else dec = true;

        while(j < nums.length - 1){
            else if(nums[j + 1] > nums[j] ){
                if(dec) return false;
            }
            else if(nums[j + 1] < nums[j]){
                if(inc) return false;
            }
            j++;
        }

        return true;
    }
}