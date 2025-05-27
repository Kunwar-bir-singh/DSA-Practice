class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int diffArr [] = new int [s.length() + 1];
        StringBuilder ans = new StringBuilder("");

        for(int shift[] : shifts){
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];

            diffArr[start] = dir == 1 ? diffArr[start] + 1 : diffArr[start] - 1;
            diffArr[end + 1] = dir == 1 ? diffArr[end + 1] - 1 : diffArr[end + 1] + 1;
        }

        int preSum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            
            preSum += diffArr[i];

            int shiftedIndex = (s.charAt(i) - 'a' + preSum) % 26;

            if (shiftedIndex < 0) {
                shiftedIndex += 26;  
            }

            char newChar = (char) ('a' + shiftedIndex);
            ans.append(newChar);
        } 

        return ans.toString();
    }
}