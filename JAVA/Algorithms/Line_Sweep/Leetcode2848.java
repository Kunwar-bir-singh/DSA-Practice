class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int points = 0;
        
        int len = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            len = Math.max(len, nums.get(i).get(1));
        }
        
        int diffArr[] = new int [len + 1];

        for(int i = 0 ; i < nums.size() ; i++){
            int start = nums.get(i).get(0);
            int end = nums.get(i).get(1);
            diffArr[start - 1] += 1;
            diffArr[end] -= 1; 
        }

        int sum = 0;
        for(int i : diffArr){
            sum += i;
            if(sum > 0) points++;
        } 
        return points;
    }
}