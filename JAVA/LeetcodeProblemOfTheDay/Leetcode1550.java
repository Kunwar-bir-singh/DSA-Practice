class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;

        for(int i : arr){
            if(count == 3 ) break;
            if(i % 2 == 1)count ++;
            else count = 0;
        }

        return count == 3 ? true : false;
    }
}