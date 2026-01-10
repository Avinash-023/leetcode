class Solution {
    public int minSwaps(int[] nums) {
        int total=0;
        for(int i:nums){
            if(i==1){
                total++;
            }
        }
        if(total==0){
            return 0;
        }
        int left=0;
        int right=total;
        int count=0;
        for (int i = 0; i < total; i++) {
            if (nums[i] == 0) count++;
        }
        int mn=count;
        int n=nums.length;
        while(right<n+total){
            if(nums[left%n]==0){
                count--;
            }
            if(nums[right%n]==0){
                count++;
            }
            mn=Math.min(mn,count);
            left++;
            right++;
        }
        return mn;
    }
}
