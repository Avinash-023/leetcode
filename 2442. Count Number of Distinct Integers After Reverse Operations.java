class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
            int rev=0;
            while(i>0){
                rev=rev*10+i%10;
                i/=10;
            }
            s.add(rev);
        }
        return s.size();
    }
}
