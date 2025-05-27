class Solution {
    public long coloredCells(int n) {
        if(n == 1 ) return n;

        long coloredCells = 1;
        long pattern = 0;

        for(int i = 1 ; i < n ; i++){
            pattern = pattern + 4;
            coloredCells = coloredCells + pattern;
        }

        return coloredCells;
    }
}