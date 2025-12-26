class Solution {
    public int bestClosingTime(String customers) {
        int totalY = 0;
        
        for(int i = 0 ; i < customers.length() ; i++){
            if(customers.charAt(i) == 'Y') totalY++;
        }

        int currY = 0;
        int currN = 0;
        int minPenalty = totalY;
        int index = 0;

        for(int i = 0 ; i < customers.length() ; i++){
             if(customers.charAt(i) == 'Y') currY++;
             else currN++;

            if(totalY - currY + currN < minPenalty){
                minPenalty = totalY - currY + currN;
                index = i + 1;
            }
        }
        return index;
    }
}