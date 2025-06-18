class Solution {
    public int[][] divideArray(int[] nums, int k) {

       Arrays.sort(nums);
        int len = nums.length;

        int[][] result = new int[len / 3][3];

        for(int i = 0 ; i < len ; i += 3){
            if(nums[i + 2] - nums[i] > k ) return new int [0][0];

            result[i / 3] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
        }
        return result;
    }
}