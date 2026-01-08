class Solution {
    public String reversePrefix(String s, int k) {
        String ele=s.substring(0,k);
        StringBuilder sb=new StringBuilder(ele);
        String res=sb.reverse().toString()+s.substring(k);
        return res;
    }
}
