class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int posNum [] = new int [len / 2];
        int negNum [] = new int [len / 2];
        int ans[] = new int [len]; 

        int posIndex = 0;
        int negIndex = 0;
        
        for(int num : nums){
            if(num > 0){
                posNum[posIndex] = num;
                posIndex++;
            }
            else{
            negNum[negIndex] = num;
            negIndex++;    
            }
        }

        posIndex = 0;
        negIndex = 0;
        for(int i = 0 ; i < len ; i++){
            if(i % 2 == 0){
                ans[i] = posNum[posIndex];
                posIndex++;
            }    
            else {
                ans[i] = negNum[negIndex];
                negIndex++;
            }
        }

        return ans;
    }
}