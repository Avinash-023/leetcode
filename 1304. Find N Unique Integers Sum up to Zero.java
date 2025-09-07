class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int i=0;
        int ele=1;
        if(n%2!=0){
            ans[i]=0;
            i++;
        }
        while(i!=n){
            ans[i]=ele;
            i++;
            ans[i]=-ele;
            i++;
            ele++;
        }
        return ans;
    }
}
