class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int endPoint = 0;

        for (int i = 0; i < trips.length; i++) {
            int currEnd = trips[i][2];

            endPoint = Math.max(endPoint, currEnd);
        }

        int diffArr[]  = new int [endPoint + 1];

        for (int i = 0; i < trips.length; i++) {
            int currPassengers = trips[i][0];
            int currStart = trips[i][1];
            int currEnd = trips[i][2];

            diffArr[currStart] = diffArr[currStart] + currPassengers;
            diffArr[currEnd ] = diffArr[currEnd] - currPassengers;
        }

        int passengers = 0;
        for(int i = 0 ; i < diffArr.length ; i++){
            passengers += diffArr[i];
            if(passengers > capacity ) return false;
        }
        return true;
    }
}