class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int rem = len % k;

        String [] ans = new String[rem == 0 ? len / k : (len / k) + 1];

        int i = 0;
        int j = 0;
        int index = 0;

        String curr = "";

        while(j < len){
            curr += s.charAt(j);
            if(j - i == k - 1){
                ans[index] = curr;
                index++;
                curr = "";
                i = j + 1;
            }
            j++;
        }

        if(rem > 0){
            for(int count = rem ; count < k ; count++){
                curr += fill;
            }
            ans[index] = curr;
        }

        return ans;
    }
}