class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        
        addSubset(nums, ansList, currList, 0);

        return ansList;
    }

    public static void addSubset(int[] nums, List<List<Integer>> ansList, List<Integer> currList, int index ) {
        if(index >= nums.length){
            ansList.add(new ArrayList<>(currList));
            return;
        }
        
        addSubset(nums, ansList, currList, index + 1);
        currList.add(nums[index]);
        addSubset(nums, ansList, currList, index + 1);
        currList.remove(currList.size() - 1);

    }
}