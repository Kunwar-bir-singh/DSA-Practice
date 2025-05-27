class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxAns = 0;
        boolean flag = false;
        int i = 0;
        int j = 0;

        while (j < s.length()) {
            if (flag == true) {
                maxAns = Math.max(maxAns, set.size());
                if (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(i));
                    flag = false;
                }
                i++;
            } else if (set.contains(s.charAt(j))) {
                flag = true;
            } else {

                set.add(s.charAt(j));
                j++;
            }
        }
        maxAns = Math.max(maxAns, set.size());
        return maxAns;
    }
}