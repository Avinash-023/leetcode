class Solution {
    public String decodeMessage(String key, String message) {
        String str="abcdefghijklmnopqrstuvwxyz";
        Map<Character,Character> map=new HashMap<>();
        int index=0;
        for(char ch:key.toCharArray()){
            if(ch!=' ' && !map.containsKey(ch)){
                map.put(ch,str.charAt(index));
                index++;

            }
        }
        String res="";
        for(char ch:message.toCharArray()){
            if(ch!=' '){
                res+=map.get(ch);
            }
            else{
                res+=" ";
            }
        }
        return res;
    }
}
