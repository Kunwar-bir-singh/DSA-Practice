class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int count = 0;
        int j = 0;

        for(int i = 0 ; i < str1.length() ; i++){
           if(j < str2.length()){
            if(str1.charAt(i) != str2.charAt(j)){

                int firstStringCharVal = str1.charAt(i);
                int secondStringCharVal = str2.charAt(j);

                if((firstStringCharVal == 122 && secondStringCharVal == 97) || ( firstStringCharVal + 1 == secondStringCharVal )){
                    j++;
                    count++;
                }
            }
            else{
                j++;
                count++;
            }
           }
        }
        return count == str2.length() ? true : false;
    }
}