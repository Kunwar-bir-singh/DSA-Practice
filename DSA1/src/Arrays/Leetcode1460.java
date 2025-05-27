class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int [] flagArr = new int [1001];

        for(int i = 0 ; i < arr.length ; i++){
            int currTargetElem = target[i];
            int currArrElem = arr[i];

            flagArr[currTargetElem] += 1;
            flagArr[currArrElem] -= 1;
        }

        for(int j = 0 ; j < flagArr.length ; j++){
            if(flagArr[j] != 0) return false;
        }
        return true;
    }
}