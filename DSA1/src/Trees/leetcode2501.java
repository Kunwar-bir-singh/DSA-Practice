class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet <Long> set = new HashSet<>();

        for(int i : nums){
            set.add((long)i);
        }
        int count = 1;

        for(int k  : nums){
            long sqr = k;
            int tempCount = 1;
            for(int j = 0 ; j < 5 ; j++){
                if(set.contains(sqr * sqr)){
                    sqr = sqr * sqr;
                    tempCount++;
                }
            }
            count = Math.max(tempCount, count);
        }
        return count == 1 ? -1 : count;
    }
}