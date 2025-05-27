import java.util.HashSet;
public class KadaneAlgo {
    public static void main(String[] args) {
        int arr [] = {1,-3,4,-5,5,2};
        System.out.println(lenOfLongSubarr(arr , arr.length , 2));
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int start = 0;
        int end = 0;
        int currSum = A[end];
        int length = 0;

        while(end < N-1){
            if(currSum == K){
                if((end-start+1) > length) length = (end-start+1);
                start = end;
                currSum = A[start];
            }
            else if(currSum < K){
                end ++;

                currSum += A[end];
            }
            else{
                start++;
            }
        }
        return length;
        //Complete the function
    }
}
//    public static int lengthOfLongestSubstring(String s) {
//        if (s.isEmpty()) return 0;
//        if (s.length() == 1) return 1;
//
//        int start = 0;
//        int end = 0;
//        int maxCount = 0;
//        HashSet <Character> set = new HashSet<>();
//
//        while(start < s.length() && end < s.length() ){
//            if(!set.contains(s.charAt(end))) {
//                set.add(s.charAt(end));
//                end++;
//            }
//            else{
//                maxCount = Math.max(maxCount , set.size());
//                set.clear();
//                start++;
//                end= start;
//            }
//        }
//        if(maxCount < set.size()) return set.size();
//        return maxCount;
//    }

