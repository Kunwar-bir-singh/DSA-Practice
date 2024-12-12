class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int [] validArr =  new int [nums.length];
        boolean [] ansArr = new boolean [queries.length];

        validArr[0] = 0;
       
        for(int i  = 1 ; i < nums.length ; i++){
            if(nums[i] % 2 == nums[i-1] % 2){
                validArr[i] = validArr[i -1] + 1;  
            }
            else validArr[i] = validArr[i-1]; 
        }

        for(int j = 0 ; j < queries.length ; j++){
            int start = queries[j][0];
            int end = queries[j][1];

            if(validArr[start] - validArr[end] == 0) ansArr[j] = true;
        }
        return ansArr;
    }
}