class Solution {
    public boolean canConstruct(String s, int k) {
        int [] freqArr = new int [26];
        int oddCount = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freqArr[ch - 'a'] += 1;
        }

        for(int i = 0 ; i < freqArr.length ; i++){
            if((freqArr[i] & 1) == 1) oddCount ++;
        }

        if(s.length() < k || oddCount > k) return false;
        return true;
    }
}