class Solution {
    public int countSubarrays(int[] nums) {
        int ans = 0;

        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(j - i == 2){
                if((nums[j] + nums[i] )* 2 == nums[i + 1] ) ans++ ;
                i++;
            }
            j++;
        }

        return ans;
    }
}