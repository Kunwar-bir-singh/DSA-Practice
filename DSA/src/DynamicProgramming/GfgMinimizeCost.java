class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int dp[] = new int [arr.length];
        dp[0] = 0;
        
        for(int i = 1 ; i < arr.length ; i++){
            
            int minJump = Integer.MAX_VALUE;
            
            for(int j = 1 ; j <= k ; j++){
                if(i >= j){
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    minJump = Math.min(minJump , jump);
                }
            }
            dp[i] = minJump;
        }
        return dp[arr.length - 1];
    }
}
