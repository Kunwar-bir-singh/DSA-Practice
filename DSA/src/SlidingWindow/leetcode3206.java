class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ansCount = 0;
        int lastTile = -1;
        int subLen = 0;

        int i = 0;
        int j = 0;

        while(i < colors.length){
            if(j == colors.length) j = j % colors.length;

            if (colors[j] != lastTile) {
                subLen++;
                lastTile = colors[j];
                j++;

                if (subLen == 3) {
                    ansCount++;
                    subLen--;
                    i++;
                }
            } 
            else{
                i++;
                j = i;
                lastTile = -1;
                subLen = 0;
            }
        }
        return ansCount;

    }
}