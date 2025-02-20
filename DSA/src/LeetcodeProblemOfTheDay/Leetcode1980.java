class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String[] ans = new String[1];
        ans[0] = "";
        calSeq(nums, "", ans);

        return ans[0];
    }

    public static void calSeq(String[] nums, String curr, String[] ans) {
        if (curr.length() == nums.length) {
            if (validString(curr, nums)) {
                ans[0] = curr;
            }
            return;
        }
        if (ans[0].length() > 0)
            return;

        calSeq(nums, curr + '0', ans);
        calSeq(nums, curr + '1', ans);

    }
    public static boolean validString(String curr, String [] nums){
        for(int i = 0 ; i < nums.length ; i++){
            if(curr.equals(nums[i])) return false;
        }
        return true;
    }
}