class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int index=s.indexOf(part);
            int last=index+part.length();
            s=s.substring(0,index)+s.substring(last);
        }
        return s;
    }
}
