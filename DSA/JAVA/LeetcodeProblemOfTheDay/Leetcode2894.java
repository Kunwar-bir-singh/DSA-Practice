class Solution {
    public int differenceOfSums(int n, int m) {
        int isDiv = 0;
        int notDiv = 0;

        for(int i = 1 ; i <= n ; i++){
            if(i % m == 0) isDiv += i;
            else notDiv += i;
        }

        return notDiv - isDiv ;
    }
}