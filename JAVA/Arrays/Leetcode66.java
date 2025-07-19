class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        boolean added = false;

        for(int i = digits.length - 1 ; i >= 0 ; i--){
            int currNum = digits[i];
            int plusNum = currNum + 1;
            
            if(added) break;
            
            else if(plusNum == 10) {
                digits[i] = 0;
                carry = 1;
            }
            else{
                digits[i] = plusNum;
                added = true;
                carry = 0;
            }
        }
        if(carry == 1) {
            int [] newAns = new int [digits.length + 1];
            newAns[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newAns[i + 1] = digits[i];
            }
            return newAns;
        };
        
        return digits;
    }
}