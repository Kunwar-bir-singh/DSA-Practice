class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int same = 1;

        for(int i = 1 ; i < s.length()  ; i++){
            if(s.charAt(i - 1) == s.charAt(i)){
                same++;
                if(same == 3){
                    same--;
                    continue;
                }
            }else {
                same = 1;
            }
            ans.append(s.charAt(i));
        } 
        
        return ans.toString();
    }
}