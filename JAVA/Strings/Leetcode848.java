class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder();
        long sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            sum += shifts[i];
            long shift = sum % 26;
            char c = s.charAt(i);
            char shifted = (char) ((c - 'a' + shift) % 26 + 'a');
            ans.insert(0, shifted); // or build in reverse and .reverse() at end
        }

        return ans.toString();
    }
}
