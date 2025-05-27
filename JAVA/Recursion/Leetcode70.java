class Solution {
    public int climbStairs(int n) {
        int currStep = 2;
        int prevStep = 1;

        if(n == 1) return prevStep;
        if(n == 2) return currStep;

        for(int i = 3 ; i <=n ; i++){
            int addedSteps = currStep + prevStep;
            prevStep = currStep;
            currStep = addedSteps;
        }
        return currStep;
    }
}