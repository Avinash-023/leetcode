class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int left=0;
        int right=0;
        Arrays.sort(trainers);
        Arrays.sort(players);
        int n=trainers.length;
        while(right<n && left<players.length){
            if(players[left]<=trainers[right]){
                left++;
            }
            right++; 
        }
        return left;       
    }
}
