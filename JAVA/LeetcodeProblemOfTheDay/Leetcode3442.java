class Solution {
    public int maxDifference(String s) {
        int freqArr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freqArr[ch - 'a']++;
        }

        int maxOdd = -1;
        int maxEven = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;

        for (int freq : freqArr) {
            if (freq > 0) {
                if (freq % 2 == 0) {
                    maxEven = Math.min (maxEven, freq);
                } 
                else maxOdd = Math.max(maxOdd, freq);
                if(maxOdd > 0 && maxEven < Integer.MAX_VALUE){
                    maxDiff = Math.max(maxDiff, (maxOdd - maxEven));
                }
            }
        }
        return maxDiff ;
    }
}