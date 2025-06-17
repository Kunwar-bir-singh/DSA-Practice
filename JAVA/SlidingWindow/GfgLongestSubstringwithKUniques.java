// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int curr = 0;
        int i = 0;
        int j = 0;
        
        while(j < s.length()){
            char ch = s.charAt(j);
            while(map.size() > k){
                char removed = s.charAt(i);
                int count = map.get(removed);
                if(count == 1) map.remove(removed);
                else map.put(removed, count - 1);
                i++;
            }
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
            if(map.size() == k) maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen == 0 ? -1 : maxLen ;
    }
}