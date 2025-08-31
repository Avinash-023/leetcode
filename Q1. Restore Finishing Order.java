class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int i=0;
        for(int val:order){
            for(int j=0;j<friends.length;j++){
                if(val==friends[j]){
                    ans[i]=val;
                    i++;
                    break;
                }
            }
        }
        return ans;
    }
}
