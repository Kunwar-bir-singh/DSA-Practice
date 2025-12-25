class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long ans = 0;
        int minus = 0;
        int index = happiness.length - 1;

        while(k > 0){
            if(happiness[index] - minus > 0){
                ans += happiness[index] - minus;
                minus++;
            }
            k--;
            index--;
        }
        return ans;

    }
}