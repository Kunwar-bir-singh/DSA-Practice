class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = 0;
        int currSum = 0;

        int i  = 0; 
        int j = 0;

        while(j < nums.length){
            int freq = map.getOrDefault(nums[j] , 0);

            if(freq == 1){
                while(nums[i] != nums[j]){
                    currSum -= nums[i];
                    int ithFreq = map.getOrDefault(nums[i] , 0);
                    map.put(nums[i], ithFreq - 1);
                    i++;
                }
                i++;
            }
            else{
                currSum += nums[j];
                maxSum = Math.max(currSum, maxSum);
                map.put(nums[j], freq + 1);
            }
            j++;
        }   
        return maxSum;
    }
}