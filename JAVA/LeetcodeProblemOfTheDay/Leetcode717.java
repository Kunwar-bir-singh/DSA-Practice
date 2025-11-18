class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length - 1] == 1) return false;

        int lastBit = 0;

        for(int i = 0 ; i < bits.length ; i++){
            if(bits[i] == 1){
                i++;
                lastBit = 2;
            }
            else lastBit = 1;
        }
        return lastBit == 1;
    }
}