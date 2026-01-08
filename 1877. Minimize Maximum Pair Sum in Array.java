class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int mx=-1;
        while(left<right){
            int sm=nums[left]+nums[right];
            mx=Math.max(mx,sm);
            left++;
            right--;
        }
        return mx;
    }
}
