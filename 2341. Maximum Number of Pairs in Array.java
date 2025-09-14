class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        int ec=0;
        int oc=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        for(int val:map.values()){
            ec+=val/2;
            oc+=val%2;
        }
        ans[0]=ec;
        ans[1]=oc;
        return ans;
    }
}
