class Leetcode3163 {
    public String compressedString(String word) {
     StringBuilder ans = new StringBuilder();
     int freq = 1;
     for(int i = 0 ; i < word.length()-1 ; i++){
        if(word.charAt(i) != word.charAt(i+1) || freq == 9){
            ans.append((char)(freq + '0')).append(word.charAt(i));
            freq = 1;
        }
        else{
            freq++;
        }
     }
    ans.append((char)(freq + '0')).append(word.charAt(word.length()-1));
    return ans.toString();   
    }
}