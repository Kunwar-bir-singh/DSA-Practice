class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");

        while(str.length() < k){
            int currSize = str.length();
            for(int i = 0 ; i < currSize ; i++){
                char curr = str.charAt(i);
                if(curr == 'z') str.append('a');
                else {
                    str.append((char)(curr + 1));
                }
            }
        }
        return str.charAt(k - 1);
    }
}