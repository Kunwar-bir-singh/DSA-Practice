class Solution {
     public int subsetXORSum(int[] nums) {
        int [] sum = new int [1];
        ArrayList<Integer> currList = new ArrayList<>();

        calSub(nums, sum, currList, 0);

        return sum[0];
    }
    public static void calSub(int [] nums, int[] sum, ArrayList<Integer> currList, int index){
        if(index >= nums.length){
            sum[0] += calSum(currList);
//            System.out.println("THE SUM IS " + sum[0]);
            return;
        }
        calSub(nums, sum, currList, index + 1);
        currList.add(nums[index]);
        calSub(nums, sum, currList, index + 1);
        currList.remove(currList.size() - 1);
    }
    public static int calSum( ArrayList<Integer> currList){
        int currSum = !currList.isEmpty() ? currList.get(0) : 0;

        for(int i = 1 ; i < currList.size() ; i++){
            currSum = currSum ^ currList.get(i);

        }
        return currSum;
    }
}