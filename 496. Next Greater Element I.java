class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length-1;i++){
            boolean b=false;
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                    map.put(nums2[i],nums2[j]);
                    b=true;
                    break;
                }
            }
            if(b==false){
                map.put(nums2[i],-1);
            }
        }
        map.put(nums2[nums2.length-1],-1);
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
