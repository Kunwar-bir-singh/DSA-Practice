class Solution {
    public int countPalindromicSubsequence(String s) {
        int [] minIndex = new int [26];
        int [] maxIndex = new int [26];

        for(int i  = 0; i < 26 ; i++){
            minIndex[i] = Integer.MAX_VALUE;
            maxIndex[i] = Integer.MIN_VALUE;
        }

        for(int j = 0 ; j < s.length() ; j++ ){
            int chIndex = s.charAt(j) - 'a';
            minIndex[chIndex] = Math.min(minIndex[chIndex], j);
            maxIndex[chIndex] = Math.max(maxIndex[chIndex], j); 
        }
        int count = 0;
        for(int k = 0 ; k < 26 ; k++){
            if(minIndex[k] == Integer.MAX_VALUE || maxIndex[k] == Integer.MIN_VALUE ) continue;

            HashSet <Character> uniqueChar = new HashSet<>();

            for(int l = minIndex[k] + 1 ; l < maxIndex[k] ; l++){
                uniqueChar.add(s.charAt(l));
            }
            count += uniqueChar.size();
        }
        return count;
    }
}