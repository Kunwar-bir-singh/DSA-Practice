class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posArr[] = new int [nums.length / 2];
        int negArr[] = new int [nums.length / 2];

        int pos = 0;
        int neg = 0;

        for(int num : nums){
            if(num > 0){
                posArr[pos++] = num;
            }
            else negArr[neg++] = num;
        }

        pos = 0;
        neg = 0;
        
        for(int i = 0 ; i < nums.length ; i+=2){
            nums[i] = posArr[pos++];
            nums[i + 1] = negArr[neg++];
        }
        return nums;
    }
}