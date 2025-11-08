class Solution {
    public boolean scoreBalance(String s) {
        int i=0;
        for(int j=i;j<s.length();j++){
            String str1=s.substring(i,j+1);
            String str2=s.substring(j+1,s.length());
            int res1=0;
            int res2=0;
            int flag=0;
            for(char ch:str1.toCharArray()){
                res1+=ch-'a'+1;
            }
            for(char ch:str2.toCharArray()){
                res2+=ch-'a'+1;
            }
            if(res1==res2){
                return true;
            }
        }
        return false;
    }
}
