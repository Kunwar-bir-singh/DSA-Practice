class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = Arrays.stream(nums).sum();

        int [][] memo = new int[nums.length][2 * totalSum + 1];

        for (int[] row : memo)
            Arrays.fill(row, -1);

        return calculateWays(nums, target, memo, 0, 0, nums.length, totalSum);
    }

    public static int calculateWays(int [] nums, int target, int [][] memo, int sum, int index, int length, int offset){
        if(index == length){
            if(sum == target) return 1;
            return 0;
        }

        if(memo[index][sum + offset] != - 1)  return memo[index][sum + offset];

        int neg = calculateWays(nums, target, memo, sum - nums[index], index + 1, length, offset);
        int pos = calculateWays(nums, target, memo, sum + nums[index], index + 1, length, offset);

        return memo[index][sum + offset] = neg + pos;
    }
}