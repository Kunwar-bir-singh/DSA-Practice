class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxCount[] = new int []{Integer.MIN_VALUE , 0};
        dfs(nums, maxCount, 0, 0);    
        return maxCount[1];
    }

    public static void dfs(int nums[], int []maxCount, int index, int maxOR){
        if(index == nums.length){
            if(maxOR > maxCount[0]){
                maxCount[0] = maxOR;
                maxCount[1] = 1;          
            }
            else if(maxOR ==  maxCount[0]){
                maxCount[1]++;    
            }
            return;            
        }

        dfs(nums, maxCount, index + 1, maxOR); 
        dfs(nums, maxCount, index + 1, maxOR | nums[index]);         
    
    }
}