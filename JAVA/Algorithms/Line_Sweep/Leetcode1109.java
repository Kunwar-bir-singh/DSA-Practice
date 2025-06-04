class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        int [] diffArr = new int [n + 1];

        for(int i = 0 ; i < bookings.length ; i++){
            int currFlight = bookings[i][0] - 1;
            int endFlight = bookings[i][1] - 1;
            int seats = bookings[i][2];

            diffArr[currFlight] = diffArr[currFlight] + seats;
            diffArr[endFlight + 1] =  diffArr[endFlight + 1] - seats;
        } 

        int [] ans = new int [n];
        ans[0] = diffArr[0];

        for(int i = 1 ; i < ans.length ; i++){
            ans[i] = ans[i - 1] + diffArr[i];
        }

        return ans;
    }
}