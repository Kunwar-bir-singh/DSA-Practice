class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
         PriorityQueue <int [] > que = new PriorityQueue<>((a,b) -> a[0] != b[0] ? Integer.compare(a[0] , b[0]) : Integer.compare(a[1], b [1]));

        int [] ansArr = new int [nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            que.add(new int [] { nums[i] , i});
        }

        for(int j = 0 ; j < k ; j++){
            int [] removedElem = que.remove();
            
            int val = removedElem[0];
            int index = removedElem[1];

            val *= multiplier;
            que.add(new int []\
             {val, index});
        }
        for (int[] pair : que){
            ansArr[pair[1]] = pair[0];
        }

        return ansArr;
    }
}