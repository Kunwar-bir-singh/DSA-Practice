class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> potentialList = new ArrayList<>();

        calculateSum(candidates, target,  ansList, potentialList, 0, 0);

        return ansList;
    }

    public static void calculateSum(int[] candidates, int target, List<List<Integer>> ansList, List<Integer> potentialList, int sum, int index ){
        if(sum == target){
            ansList.add(new ArrayList<>(potentialList));
            return;
        }
        else if(sum  > target){
            return;
        }
        for(int i = index ; i< candidates.length ; i++){
            potentialList.add(candidates[i]);
            calculateSum(candidates, target,  ansList, potentialList, sum + candidates[i], i);
            
            potentialList.remove(potentialList.size() -1);
        }
    }
}