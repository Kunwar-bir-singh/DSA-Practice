class Solution {
    public List<String> generateParenthesis(int n) {
       List <String> ansList = new ArrayList<>();

       genParentheRecur(n, 0, 0, ansList, "");

       return ansList; 
    }

    public static void genParentheRecur(int n, int open, int close, List <String> ansList, String curr){
        if(curr.length() == n*2){ 
            ansList.add(curr);
            return;
        }
        if(open < n)
        genParentheRecur(n, open + 1, close, ansList, curr + '(');
        
        if(close < open)
        genParentheRecur(n, open, close + 1, ansList, curr + ')');

    }

}