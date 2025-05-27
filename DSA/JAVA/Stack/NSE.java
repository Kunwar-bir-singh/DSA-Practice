public class Solution {
   public int[] prevSmaller(int[] A) {
        Stack <Integer> stack = new Stack<>();
        int ans [] = new int [A.length];
        for (int i = 0 ; i < A.length ; i++){
            while(!stack.isEmpty() && stack.peek() >= A[i] ){
                    stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() < A[i]){   
                    ans[i] = stack.peek();                
                    stack.push(A[i]);
            }
            if(stack.isEmpty()){
                stack.push(A[i]);
                ans[i] = -1;
            }
        }   
        return ans;
    }
}
