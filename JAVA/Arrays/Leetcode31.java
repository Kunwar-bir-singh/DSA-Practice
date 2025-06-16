class Solution {
   public  void nextPermutation(int[] nums) {
        int len = nums.length;
        
        for(int i = len - 1; i > 0 ; i--){
            if(nums[i - 1] < nums [i]){
                int justMax = getMax(nums, i - 1, i);
                swap(nums, justMax, i-1);
                reverse(nums, len, i);
                return;
            }
        }

        reverse(nums, len, 0);
    }

    public static void reverse(int [] nums, int len, int index){
        int i = index;
        int j = len - 1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static int getMax(int [] nums, int indexFor, int currMaxIndex){
      for(int i = currMaxIndex ; i < nums.length ; i++){
        if(nums[i] > nums[indexFor]){
            currMaxIndex = i;
        }
      }
      return currMaxIndex;
    }


    public static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}