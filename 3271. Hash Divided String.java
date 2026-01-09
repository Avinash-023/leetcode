class Solution {
    public String stringHash(String s, int k) {
        String str="abcdefghijklmnopqrstuvwxyz";
        int left=0;
        int right=k-1;
        String res="";
        while(right<s.length()){
            String sub=s.substring(left,right+1);
            System.out.println(sub);
            int val=0;
            for(char ch:sub.toCharArray()){
                val+=str.indexOf(ch);
            }
            int rem=val%26;
            res+=str.charAt(rem);
            left+=k;
            right+=k;
        }
        return res;
    }
}
