class Solution {
    public boolean canTransform(String start, String result) {
        int i = 0;
        int j = 0;
        int length = start.length();

        while(i < length || j < length ){
            while(i < length && start.charAt(i) == 'X') i++;
            while(j < length && result.charAt(j) == 'X') j++;

            if(i == length || j == length) return i == j;

            if(start.charAt(i) != result.charAt(j)) return false;

            if(start.charAt(i) == 'R'){
                if(i > j) return false;
            }
            else{
                if(j > i) return false;
            }
            i++;
            j++;
        }
        return true;
    }
}