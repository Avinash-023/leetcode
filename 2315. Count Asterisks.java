class Solution {
    public int countAsterisks(String s) {
        int ans=0;
        int symbol=0;
        for(char ch:s.toCharArray()){
            if(symbol==0 && ch=='*'){
                ans++;
            }
            else if(symbol==0 && ch=='|'){
                symbol=1;
            }
            else if(symbol==1 && ch=='|'){
                symbol=0;
            }
            
        }
        return ans;
    }
}
