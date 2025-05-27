package DSA.src.Stack;
import  java.util.*;
public class PostToPrefix {
    public static void main(String[] args) {
        System.out.println(preToPost("*-A/BC-/AKL"));
    }
    static String preToPost(String pre_exp) {
        // code here
        Stack <String> stack = new Stack<>();
        pre_exp = reverse(pre_exp);

        int i = 0;
        while(i < pre_exp.length()){
            char ch = pre_exp.charAt(i);

            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                stack.push(Character.toString(ch));

            }
            else{
                String a = stack.pop();
                String b = stack.pop();
                String c = a+b+ch;
                stack.push(c);
            }
            i++;
        }
        return stack.pop();
    }

    static String reverse(String word){
        String rev = "";

        for(int i = 0 ; i < word.length(); i ++){
            rev += word.charAt(word.length() - 1 - i);
        }
        return rev;
    }
}
