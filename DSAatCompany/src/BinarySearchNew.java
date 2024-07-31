import java.util.Arrays;
import java.util.Stack;

public class BinarySearchNew {
    public static void main(String[] args) {
        String s = "the sky is blue";
        reverseWords(s);
    }

    public static String reverseWords(String s) {
        Stack <String> stack =  new Stack<>();
        String word = "";
        for(int i = 0 ; i <s.length() ; i++){
            if(s.charAt(i) == ' ' ){
                if(i < s.length()-1){
                    if(s.charAt(i+1) == ' ' ) continue;
                }
                stack.push(word);
                System.out.println(stack);
                word = "";
            }
            else{
                word+= s.charAt(i);
            }
        }

        String ans="";
        while(!stack.empty()){
            if(stack.peek() == ""  ) stack.pop();
            else {
                ans+= stack.pop();
                ans+=" ";
            }
        }
        return ans;
    }
}
