class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans=new int[2];
        for(int i=1;i<=n;i++){
            int a=i;
            int b=n-i;
            boolean x=String.valueOf(a).contains("0");
            boolean y=String.valueOf(b).contains("0");
            if(a+b==n && !x && !y){
                ans[0]=a;
                ans[1]=b;
            }
        }
        return ans;
    }
}
