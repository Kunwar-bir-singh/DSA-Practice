class Solution {
    public int minimumRecolors(String blocks, int k) {
        int blackCount = 0;
        int whiteCount = 0;

        int minRecolor = k;

        int i = 0;
        int j = 0;

        while (j < blocks.length()) {
            if (blocks.charAt(j) == 'W') whiteCount++;
            else blackCount++;

            j++;
            
            if (j - i == k ) {
                minRecolor = Math.min(minRecolor, whiteCount);

                if (blocks.charAt(i) == 'W') whiteCount--;
                else blackCount--;
                i++;
            }
          
        }

        return minRecolor;
    }
}