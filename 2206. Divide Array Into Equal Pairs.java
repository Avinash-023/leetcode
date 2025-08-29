class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        int sum=0;
        for(int val : map.values()){
            if(val%2==0){
                count++;
                sum+=val;
                System.out.println(val);
            }
        }
        return sum/2==n;
    }
}
