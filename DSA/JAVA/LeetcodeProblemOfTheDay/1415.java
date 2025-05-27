class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> list = new ArrayList<>();

        calSeq(n, k , "", list);
        
        return k > list.size() ? "" : list.get(k - 1);
    }

    public static void calSeq(int n, int k , String curr, ArrayList<String> list){
        if(curr.length() == n){
            list.add(curr);
            return;
        }
        for(char ch = 'a' ; ch < 'd' ; ch++){
            if(curr.length() > 0 && curr.charAt(curr.length() - 1 ) == ch) continue;
            calSeq(n, k , curr + ch, list);
        }
    }
}