class Solution {
    public int numSub(String s) {
        int i = 0;
        int j = 0;

        int mod = 1000000007;
        long ans = 0;        
	
	    while(j < s.length()){
		    if(s.charAt(j) ==  '1' ){
			    ans = ans + 1 + (j - i);
		    }
		    else i = j + 1;
		    j++;
	    }
        return (int)(ans % mod);
    }
}