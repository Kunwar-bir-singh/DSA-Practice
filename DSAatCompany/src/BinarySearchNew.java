import java.util.Arrays;

public class BinarySearchNew {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 2));

    }
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l+1 < r){
            int m = l + (r-l)/2;
            if(Predicate(nums, nums[m] , l , r , target) == 0 ) l = m;
            else r = m;
        }
        if(nums[l] == target) return l;
        if(nums[r] == target) return r;
        else return -1;
    }
    public static int Predicate(int []nums, int m , int l , int r , int target){
        if(m >= target){
            if(nums[l] > target) return 0;
            else return 1;
        }
        else{
            if(nums[l] < target) return 1;
            else return 0;
        }
    }
}
