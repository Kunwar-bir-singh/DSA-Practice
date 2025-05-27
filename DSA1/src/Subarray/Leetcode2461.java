class Leetcode2461 {
    public  long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        long currSum = 0;
        long ans = 0;

        while(j < nums.length){
            if(set.contains(nums[j])){
               set.remove(nums[i]);
               currSum -= nums[i];
                i++;       
            }
            else{
                currSum+= nums[j];
                set.add(nums[j]);
                if(j - i == (k-1)){
                    ans = Math.max(ans, currSum);
                    currSum -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                j++;
            }
        }
    return ans;
    }
}