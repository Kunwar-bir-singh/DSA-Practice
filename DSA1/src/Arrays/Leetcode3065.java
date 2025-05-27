class Solution {
    public int minOperations(int[] nums, int k) {
        int ansCount = 0;

        for(int i : nums){
            if(i < k) ansCount++;
        }

        return ansCount;
    }
}