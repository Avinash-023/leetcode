class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int moves=0;
        for(int i:nums){
            int diff=n-i;
            moves+=diff;
        }
        return moves;
    }
}
