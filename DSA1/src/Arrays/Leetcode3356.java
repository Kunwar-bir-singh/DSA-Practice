class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int low = 0;
        int high = queries.length;

        while(low <= high){
            int mid = low + (high - low ) / 2;
            if(SumIsZero(nums, queries, mid)){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low > queries.length ? -1 : low;
    }

    public static boolean SumIsZero(int [] nums, int [][] queries, int k){
        int [] diffArr = new int [nums.length + 1];

        for(int i = 0 ; i < k ; i++){
            int rangeStart = queries[i][0];
            int rangeEnd = queries[i][1];
            int rangeValue = queries[i][2];

            diffArr[rangeStart] += rangeValue;
            diffArr[rangeEnd + 1] -= rangeValue;
        }

        int sum = 0;
        for(int i = 0 ; i < diffArr.length - 1 ; i++){
            sum += diffArr[i];

            if(sum < nums[i]) return false;
        }
        return true;
    }
}