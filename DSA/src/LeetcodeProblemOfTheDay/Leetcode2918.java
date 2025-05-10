class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int zero1 = 0;
        int zero2 = 0;

        long sum1 = 0;
        long sum2 = 0;

        for(int i : nums1){
            if(i == 0) zero1++;
            sum1 += i;
        }

        for(int i : nums2){
            if(i == 0) zero2++;
            sum2 += i;
        }

        long zeroSum1 = zero1 + sum1;
        long zeroSum2 = zero2 + sum2;

        if(zero1 == 0 && zero2 == 0){
            if(zeroSum1 != zeroSum2) return -1;
        }
        if(zero1 == 0 || zero2 == 0){
            if(zero1 == 0 && zeroSum1 < zeroSum2) return -1;
            if(zero2 == 0 && zeroSum2 < zeroSum1) return -1;
        }

        return Math.max(zeroSum1 , zeroSum2);

    }
}