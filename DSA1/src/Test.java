import java.util.ArrayList;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int [] nums = {1,5,4,2,9,9,9} ;
        int k = 3;
        maximumSubarraySum(nums,k);
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet <Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        long currSum = 0;
        long ans = 0;

        while(j < nums.length){
            if(j - i == k){
                ans = Math.max(ans, currSum);
                currSum = 0;
                i++;
                j=i;
                set.clear();
            }
            else if(set.contains(nums[j])){
                i=j;
                currSum=0;
                set.clear();
            }
            else{
                set.add(nums[j]);
                currSum += (long) nums[j];
                j++;
            }
        }
        return ans;
    }
}
