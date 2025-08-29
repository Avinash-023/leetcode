class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ps=i+1;
            int rev=26-(ch-'a');
            ans+=ps*rev;
        }
        return ans;
    }
}
