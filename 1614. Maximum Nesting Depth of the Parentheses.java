class Solution {
    public int maxDepth(String s) {
        int rc=0;
        int lc=0;
        int mx=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                lc++;
            }
            else if(i==')'){
                rc++;
            }
            mx=Math.max(mx,lc-rc);
        }
        return mx;
    }
}
