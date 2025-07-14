class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int ans = 0;

        int i = 0;
        int j = 0;

        while(j < trainers.length && i < players.length){
            if(trainers[j] >= players[i]){
                ans++;
                j++;
                i++;
            }
            else j++;
            
        }
        return ans;
    }
}