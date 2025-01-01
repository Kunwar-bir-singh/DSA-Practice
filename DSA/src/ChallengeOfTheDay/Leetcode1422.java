class Solution {
    public int maxScore(String s) {
        int maxScore = 0;

        int totalOne = 0;
        int totalZero = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1') totalOne++;
        }

        for(int j = 0 ; j < s.length() - 1 ; j++){
            if(s.charAt(j) == '0') totalZero++;
            else{
                totalOne--;
            }
            maxScore = Math.max(maxScore, totalOne + totalZero);
        }
        return maxScore;
    }
}