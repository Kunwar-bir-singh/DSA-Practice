package LinkedList;

public class LeetCode345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }
    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(!isVowel(charArray[left])) left++;
            if(!isVowel(charArray[right])) right--;
            if(isVowel(charArray[left]) && isVowel(charArray[right])){
                swap(charArray , left, right);
                left++;
                right--;
            }
        }
        s = new String(charArray);
        return s ;
    }
    public static boolean isVowel(char x){
        if (x == 'a' || x == 'e' || x == 'i' ||  x == 'o' || x == 'u') return true;
        if (x == 'A' || x == 'E' || x == 'I' ||  x == 'O' || x == 'U') return true;
        return false;
    }

    public static void swap(char[] charArray , int a, int b){
        char fisVowel = charArray[a];
        char secVowel = charArray[b];
        charArray[a] = secVowel;
        charArray[b] = fisVowel;
    }
}
