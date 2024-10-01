
class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack <String> stack = new Stack<>();
        
        pre_exp = reverse(pre_exp);
        
        int i = 0 ;
        
        while(i < pre_exp.length()){
            char ch = pre_exp.charAt(i);
            
            if((ch >= 'A' && ch <= 'Z' ) || (ch >= 'a' && ch <= 'z' )){
                stack.push(Character.toString(ch));
                i++;
            }
            else{
                String a = stack.pop();
                String b = stack.pop();
                String c = "(" + a + ch + b + ")";
                stack.push(c);
                i++;
            }
        }
        return stack.pop();
    }
    public static String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
