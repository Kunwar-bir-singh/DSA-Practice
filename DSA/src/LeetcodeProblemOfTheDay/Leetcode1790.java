class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int letterArr[] = new int [26];

        for(int i = 0 ; i < s1.length() ; i++){
            int s1CharIndex = s1.charAt(i) - 'a';
            int s2CharIndex = s2.charAt(i) - 'a';

            letterArr[s1CharIndex]++;
            letterArr[s2CharIndex]--;
        }

        for(int i : letterArr){
            if(i != 0) return false;
        }

        int swapCount = 0;
        
        for(int i = 0 ; i < s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)) swapCount++;
        }
        return swapCount > 2 ? false : true;
    }
}