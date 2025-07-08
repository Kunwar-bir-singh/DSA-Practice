class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : deck){
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
        }   

        int gcd = 0;
        for(int freq : map.values()){
            gcd = returnGCD(gcd, freq);
        }
        return gcd >= 2;
    }
    public static int returnGCD(int gcd, int freq){
        if (freq == 0) return gcd;
        return returnGCD(freq, gcd % freq);
    }
}