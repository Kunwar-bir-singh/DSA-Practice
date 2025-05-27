class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int max = Arrays.stream(nums).max().getAsInt();

        int currFreq = 0;

        int i = 0;
        int j = 0;
        int len = nums.length;

        while(j < len){
            if(nums[j] == max) currFreq++;

            while(currFreq >= k){
                ans += 1 + (len - j - 1);
                if(nums[i] == max) currFreq--;
                i++;
            }
            j++;
        }
        return ans;
    }
}