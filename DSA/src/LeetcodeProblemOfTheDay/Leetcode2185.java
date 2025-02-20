class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;

        for(int i = 0 ; i< words.length ; i++ ){
            String curr = words[i];

            if(curr.startsWith(pref)) ans++;
        }
        return ans;
    }
}