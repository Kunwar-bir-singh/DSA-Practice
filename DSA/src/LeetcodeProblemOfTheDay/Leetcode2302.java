class Solution {
    public long countSubarrays(int[] nums, long k) {
        long prefixSum = 0;
        long ans = 0;

        int i = 0;
        int j = 0;

         while (j < nums.length) {
            while (j < nums.length && nums[j] >= k) {
                j = j + 1;
                i = j;
            }
            if (j < nums.length) {
                prefixSum += nums[j];
                while (prefixSum * (j - i + 1) >= k) {
                    prefixSum -= nums[i];
                    i++;
                }
                if (j - i > 0)
                    ans += (j - i) + 1;
                else {
                    ans += 1;
                }
                j++;
            }
        }
        return ans;
    }
}