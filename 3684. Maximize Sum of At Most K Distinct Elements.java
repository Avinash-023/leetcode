class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        List<Integer> s=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
                if(!s.contains(nums[i])){
                    s.add(nums[i]);
                    
                } 
        }
        int ans[]=new int[k];
        if(s.size()<k){
            int l=s.size();
            int ans2[]=new int[l];
            for(int i=0;i<l;i++){
                ans2[i]=s.get(i);
            }
            return ans2;
        }
        for(int i=0;i<k;i++){
            ans[i]=s.get(i);
        }
        return ans;
    }
}
