class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        int i=0;
        while(i<nums.length){
            int num=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    num++;
                }
                if(2*num>j-i+1){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
