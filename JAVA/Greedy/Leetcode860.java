class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;

        for (int i = 0; i < bills.length; i++) {
            int currBill = bills[i];

            if (currBill == 5) {
                fiveCount += 1;
            } 
            else if (currBill == 10) {
                if (fiveCount < 1)
                    return false;

                fiveCount -= 1;

                tenCount += 1;

            } 
            else {
                if (fiveCount < 1)
                    return false;

                if (tenCount > 0) {
                    fiveCount -= 1;

                    tenCount -= 1;
                } else {
                    if (fiveCount < 3)
                        return false;

                    fiveCount -= 3;
                }
            }
        }
        return true;
    }
}