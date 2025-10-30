class Solution {
    public long removeZeros(long n) {
        String str=String.valueOf(n);
        str=str.replace("0","");
        return Long.valueOf(str);
        
    }
}
