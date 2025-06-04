
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int length =  0;
        for(int time : end){
            length = Math.max(time, length);
        }
        
        int [] diffArr = new int [length + 2];
        
        for(int i = 0 ; i < start.length ; i++){
            diffArr[start[i]] += 1;
            diffArr[end[i]] -= 1;
        }
        
        int ans = 1;
        for(int i = 1 ; i < diffArr.length ; i++){
            diffArr[i] = diffArr[i] + diffArr[i - 1];
            ans = Math.max(ans , diffArr[i]);
        }
        
        return ans;
    }
}
