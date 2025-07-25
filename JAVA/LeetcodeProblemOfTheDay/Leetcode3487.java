class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();   
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            if(set.contains(num)) continue;
            else {
                if(num > max && max < 0) max = num;
                else if(num > 0) {
                    max += num;
                }
                set.add(num);
            }
        }
        return max;
    }
}