class Solution {
    public int minimumIndex(List<Integer> nums) {

        int arrLen = nums.size();
        int dominant = -1;
        int freq = 0;
        int dominantFreq = 0;
        int firstFreq = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (freq == 0) {
                dominant = nums.get(i);
                freq = 1;
            } else {
                if (nums.get(i) == dominant)
                    freq++;
                else
                    freq--;
            }
        }

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) == dominant) {
                dominantFreq++;
            }

        }

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) == dominant) {
                firstFreq++;
                dominantFreq--;
            }

            arrLen -= 1;

            if (((i + 1) / 2) < firstFreq && (arrLen / 2) < dominantFreq)
                return i;

        }
        return -1;
    }
}