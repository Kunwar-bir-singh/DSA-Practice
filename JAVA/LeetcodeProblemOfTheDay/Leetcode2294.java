class Solution {
    public int partitionArray(int[] nums, int k) {
        int ans = 0;

        Arrays.sort(nums);

        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[j] - nums[i] > k){
                ans++;
                i = j;
            }
            j++;
        }
        if(nums[j - 1] - nums[i] <= k) ans++;
        return ans;
    }
}