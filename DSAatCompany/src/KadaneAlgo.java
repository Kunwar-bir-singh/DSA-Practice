import java.util.HashSet;
public class KadaneAlgo {
    public static void main(String[] args) {
        System.out.println("The Max substring : "+lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;

        int start = 0;
        int end = 0;
        int maxCount = 0;
        HashSet <Character> set = new HashSet<>();

        while(start < s.length() && end < s.length() ){
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
            }
            else{
                maxCount = Math.max(maxCount , set.size());
                set.clear();
                start++;
                end= start;
            }
        }
        if(maxCount < set.size()) return set.size();
        return maxCount;
    }
}
