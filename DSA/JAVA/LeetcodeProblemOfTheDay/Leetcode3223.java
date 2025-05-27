class Solution {
    public int minimumLength(String s) {
        int [] countArr = new int[26];
        int ans = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            countArr[ch - 97] ++;

            if(countArr[ch - 97]  == 3) countArr[ch - 97]  = 1;
        }

        for(int i : countArr) ans += i;

        return ans;
    }
}