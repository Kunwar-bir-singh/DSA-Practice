class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        List <Integer> currList = new ArrayList<>();

        Arrays.sort(candidates);
        calculateSum(candidates, target, ansList, currList, 0, 0);
        
        return ansList;
    }
    public static void calculateSum(int[] candidates, int target, List<List<Integer>> ansList, List<Integer> currList, int sum, int index){
        if(sum >= target){
            if(sum == target) ansList.add(new ArrayList<>(currList));
            return;
        }
        for(int i = index ; i < candidates.length ; i++ ){
            if (i > index && candidates[i] == candidates[i-1]) continue;

            currList.add(candidates[i]);

            calculateSum(candidates, target, ansList, currList, sum + candidates[i], i + 1);
            
            currList.remove(currList.size() - 1);
        }
    }
}