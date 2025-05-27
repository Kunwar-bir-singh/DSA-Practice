class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet <Integer> set = new HashSet <>();  
        for(int i : banned) set.add(i);

        int count = 0;
        int currSum = 0;

        for(int j = 1; j <= n ; j++ ){
            if(!set.contains(j)){
                currSum += j;
                count++;
            }
            if(currSum > maxSum){
                count--;
                break;
            }
        } 
        return count;
    }
}