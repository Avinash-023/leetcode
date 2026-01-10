class Solution {
    public int minOperations(int[] nums) {
        int l=0;
        int right=2;
        int count=0;
        while(right<nums.length){
            if(nums[l]==0){
                for(int i=l;i<=right;i++){
                    if(nums[i]==0){
                        nums[i]=1;
                    }
                    else{
                        nums[i]=0;
                    }
                    // System.out.println(nums[i]);
                }
                count++;
            }
            l++;
            right++;
        }
        // System.out.println(count);
        boolean flag=true;
        for(int i:nums){
            if(i==0){
                flag=false;
                break;
            }
        }
        return flag ? count : -1;
    }
}
