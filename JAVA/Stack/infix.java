package DSA.src.Stack;
import java.util.*;
public class infix {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack <Character> stack = new Stack<>();
        String ans = "";

        int i = 0;
        while(i < exp.length()){
            char ch = exp.charAt(i);

            if(stack.size() == 0) stack.push(ch);
            else if(ch == '^'){
                if(stack.peek() == '^' ) {
                    ans += stack.pop();
                }

                else {
                    i++;
                    stack.push(ch);
                }
            }
            else if(ch == '*' || ch == '/'){
                if(stack.peek() == '^'|| stack.peek() == '*' || stack.peek() == '/'  ){

                    ans += stack.pop();
                }
                else{
                    i++;
                    stack.push(ch);
                }
            }
            else if(ch == '+' || ch == '-'){
                if(stack.peek() == '^'|| stack.peek() == '*' || stack.peek() == '/'
                        || stack.peek() == '+' || stack.peek() == '-' ){

                    ans += stack.pop();
                }
                else{
                    i++;
                    stack.push(ch);
                }
            }
            else if(ch == '(') {
                i++;
                stack.push(ch);
            }
            else if (ch == ')'){
                while(stack.peek() != '('){
                    ans += stack.pop();
                }
                stack.pop();
                i++;
            }
            else{
                ans += ch;
                i++;
            }
        }
        while(stack.size() != 0) ans += stack.pop();
        return ans;

    }
}
