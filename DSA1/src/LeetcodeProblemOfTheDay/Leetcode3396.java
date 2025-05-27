class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int minOps = 0;
        int count = 0;
        int j = 0;

        for(int i = nums.length - 1 ; i >= 0  ; i--){
            if(set.contains(nums[i])){
                while(j < i){
                    if(count == 3){
                        count = 0;
                    }
                    count ++;
                    j++;
                    minOps++;
                }
            }
            else{
                set.add(nums[i]);
            }
        }
        return minOps;
    }
}