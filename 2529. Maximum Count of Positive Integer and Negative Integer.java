class Solution {
    public int maximumCount(int[] nums) {
        int pcount=0;
        int ncount=0;
        for(int i:nums){
            if(i<0){
                ncount++;
            }
            else if(i>0){
                pcount++;
            }
        }
        return Math.max(pcount,ncount);
    }
}
