class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length/3;
        int res=0;
        int i=piles.length-2;
        while(n-->0){
            res+=piles[i];
            i-=2;
        }
        return res;
    }
}
