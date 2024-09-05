package LinkedList;

public class LeetCode345 {
    public static void main(String[] args) {
        System.out.println(myAtoi("   -042"));
    }
    public static int myAtoi(String s) {
        int length = 0;
        String ans = "";
        int numAns = 0;
        boolean isNegative = false;
        boolean gotSign = false;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                if(length > 0) break;
            }
            else if(s.charAt(i) == '+'){
                if(gotSign)break;
                if(length > 0)break;
                gotSign = true;
                length = 1;
            }
            else if(s.charAt(i) == '-'){
                if(gotSign)break;
                else if(length > 0) break;
                else {
                    isNegative = true;
                    gotSign = true;
//                    length = 1;
                }
            }
            else if(s.charAt(i) == '0'){
                if(length == 0){
                    continue;
                }
                else {
                    ans += s.charAt(i);
                    length ++;
                }
            }
            else if(s.charAt(i) >= '1' && s.charAt(i) <= '9'){
                ans += s.charAt(i);
                length++;

            }
            else break;
        }
        if(ans.length() == 0) return 0;
        for(int i = 0  ; i< ans.length() ; i++){
            if(!isNegative){
                if(numAns *10 < numAns) return Integer.MAX_VALUE;
                numAns = numAns * 10 + (s.charAt(i)-'0');
            }
            else{
                int spareNum = ans.charAt(i)-'0';
                spareNum *= -1;
                if(spareNum *10 > spareNum) return Integer.MIN_VALUE;
                numAns = numAns * 10 + (ans.charAt(i)-'0');
            }
        }
        if(isNegative) return Integer.parseInt(ans)*-1;
        return Integer.parseInt(ans);
        // if(isNegative) ans *= -1;
    }
}
