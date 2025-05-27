class Solution {
    public boolean isHappy(int n) {
        HashSet<Long> set = new HashSet<>();
        boolean flag = true;

        Long sum = (long) n;

        while(flag){
            if(set.contains(sum)) return false;
            set.add(sum);

            sum = sumOfSq(sum);
            
            if(sum == 1) break; 
        }
        return true;
    }
    public static Long sumOfSq(Long sum){
        if (sum < 1) return sum; 
        long lastDigit = sum % 10;
        return (lastDigit * lastDigit) + sumOfSq(sum / 10);       
    }
}