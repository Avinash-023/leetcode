class Solution {
    public long maxTotalValue(int[] nums, int k){
        int maxele=Integer.MIN_VALUE;
        int minele=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxele=Math.max(maxele,nums[i]);
            minele=Math.min(minele,nums[i]);
        }
        return (long) k*(maxele-minele);
    }      
}
