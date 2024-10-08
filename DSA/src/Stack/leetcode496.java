//class Solution {
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        Stack<Integer> stack = new Stack<>();
//        HashMap <Integer, Integer> map = new HashMap<>();
//
//        for(int i : nums2){
//            while(!stack.isEmpty() && i > stack.peek()){
//                map.put(stack.pop() , i);
//            }
//            stack.push(i);
//        }
//
//        for(int j = 0 ; j <  nums1.length ; j++){
//            nums1[j] = map.getOrDefault(nums1[j] , -1);
//        }
//        return nums1;
//    }
//}