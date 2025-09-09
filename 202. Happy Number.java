class Solution {
    public boolean isHappy(int n) {
        Set<Integer> nums=new HashSet<>();
        while(n!=1 && !nums.contains(n)){
            nums.add(n);
            int sum=0;
            while(n>0){
                int a=n%10;
                sum+=a * a;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}
