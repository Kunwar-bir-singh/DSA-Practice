class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int digFreq[] =  new int [10];

        for(int i : digits) digFreq[i]++;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 100 ; i <= 999 ; i+=2){
            int oneDigit = i/100;
            int tenDigit = (i / 10) % 10;
            int hunDigit = i % 10;

            int[] tempFreq = new int[10];
            tempFreq[oneDigit]++;
            tempFreq[tenDigit]++;
            tempFreq[hunDigit]++;

            boolean canForm = true;
            for (int j = 0; j < 10; j++) {
                if (tempFreq[j] > digFreq[j]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) list.add(i);
        }
        int ans[] = new int [list.size()];
        
        for(int i = 0 ; i < list.size() ; i++) ans[i] = list.get(i);

        return ans;
   }
}