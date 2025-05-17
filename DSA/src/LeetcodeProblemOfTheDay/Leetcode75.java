class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex = 0;
        int twoIndex = nums.length - 1;
        int currIndex = 0;

        while(currIndex <= twoIndex){
            if(nums[currIndex] == 0) {
                swap(nums, currIndex, zeroIndex);
                zeroIndex++;
                currIndex++;
            }
            else if (nums[currIndex] == 2){
                swap(nums, currIndex, twoIndex);
                twoIndex--;
            } 
            else currIndex++;
        }
    }

    public static void swap(int [] nums,int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp; 
    }
}