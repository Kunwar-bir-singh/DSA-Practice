class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        Arrays.sort(nums);

        calculateSubsets(nums,ansList, currList, 0 );

        return ansList;
    }
    public static void calculateSubsets(int [] nums, List<List<Integer>> ansList, List<Integer> currList, int index ){
        ansList.add(new ArrayList<>(currList));

        for(int i = index ; i < nums.length ; i++ ){
            if(i > index && nums[i] == nums[i-1]) continue;
            currList.add(nums[i]);
            calculateSubsets(nums, ansList, currList, i + 1 );
            currList.remove(currList.size() - 1 );
        }
    }
}                                                                                                           