class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet <Integer> set = new HashSet<>();
        int [] ansArr = new int [A.length];
        
        for(int i = 0 ; i < A.length ; i++){
            int count = 0;
            
            if(set.contains(A[i])) count++;
            else set.add(A[i]);
            
            if(set.contains(B[i])) count++;
            else set.add(B[i]);

            if(i > 0) ansArr[i] = ansArr[i - 1];
            ansArr[i] += count;
        }
        return ansArr;
    }
}