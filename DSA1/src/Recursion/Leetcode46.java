class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        calPermut(ansList, currList, nums);
        return ansList;
    }
    public static void calPermut(List<List<Integer>> ansList, List<Integer>currList, int[] nums){
        if(currList.size() == nums.length){
            ansList.add(new ArrayList<>(currList));
        }
        else{
            for(int i = 0 ; i < nums.length ; i++){
                if(currList.contains(nums[i])) continue;
                currList.add(nums[i]);

                calPermut(ansList, currList, nums);

                currList.remove(currList.size() - 1);
            }
        }
    }
}