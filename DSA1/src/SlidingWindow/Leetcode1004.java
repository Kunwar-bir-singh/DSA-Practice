class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        
        int ans = 0;
        int zeroCount = 0;

        while(j < nums.length){
            if(nums[j] == 0) {
                zeroCount++;
                if(zeroCount == k + 1 ){
                    ans = Math.max(ans, (j - i ));
                    while(i < nums.length && nums[i] != 0) i++;
                    i++;
                    zeroCount -=1;
                }
            }
            j++;
        }
        return (j - i + 1 > ans) ? j - i   : ans;
    }
}