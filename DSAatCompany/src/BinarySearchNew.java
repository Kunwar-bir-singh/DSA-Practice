import java.util.Arrays;
import java.util.Stack;

public class BinarySearchNew {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        int k = 1;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        int arrSum = 0;
        for(int i : nums) arrSum += i;
        int l = -1;
        int r = arrSum;

        while(l+1 < r){
            int m = l + (r-l)/2;
            if(Predicate(nums, m , k) == 0) l = m;
            else r = m;
        }
        return r;
    }
    public static int Predicate(int[] nums, int mid , int k){
        int preSum = 0;
        int noOfSubArrays = 0;
        for(int j : nums){
            if(j > mid ) return 0;
            preSum += j;
            if(preSum > mid){
                noOfSubArrays++;
                preSum = j;
            }
        }
        if(preSum > 0) noOfSubArrays ++;
        if(noOfSubArrays <= k) return 1;
        return 0;
    }
}
