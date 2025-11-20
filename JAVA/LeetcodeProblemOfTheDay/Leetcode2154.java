class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        int finalValue = original;

        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(finalValue)){
                finalValue = finalValue * 2;
            }
            else break;
        }
        return finalValue;
    }
}