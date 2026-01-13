class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int freq=0;
            int val=0;
            if(2*i<nums.length && 2*i+1<nums.length){
                freq=nums[2*i];
                val=nums[2*i+1];
            }
            while(freq>0){
                arr.add(val);
                freq--;
            }
        }
        int[] res=new int[arr.size()];
        int index=0;
        for(int i:arr){
            res[index++]=i;
        }
        return res;
    }
}
