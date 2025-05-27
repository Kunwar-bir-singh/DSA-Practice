class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        combinationSum(k, n, 0, 1, ansList, currList);
        return ansList;

    }

    public static void combinationSum(int k, int n, int sum, int index, List<List<Integer>> ansList, List<Integer> currList){
        if(sum == n && currList.size() == k){
            ansList.add(new ArrayList<>(currList));
            return;
        }
        if(sum > n || currList.size() > k) return;

        for(int i = index ; i <= 9 ; i++ ){
            currList.add(i);
            combinationSum(k, n, sum + i , i + 1, ansList, currList);
            currList.remove(currList.size() - 1);
        }
    }
}