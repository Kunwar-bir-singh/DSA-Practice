class Solution {
    public boolean canAliceWin(int[] nums) {
        int oneDigSum = 0;
        int tenDigSum = 0;

        for(int num : nums){
            if(num >= 10) tenDigSum += num;
            else oneDigSum += num;
        }
        return tenDigSum == oneDigSum ? false : true;
    }
}