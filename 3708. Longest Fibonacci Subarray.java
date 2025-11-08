class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen=2;
        for(int i=0;i<nums.length;i++){
            for(int j=i+2;j<nums.length;j++){
                if(nums[j]==nums[j-1]+nums[j-2]){
                    maxlen=Math.max(maxlen,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxlen;
    }
}
