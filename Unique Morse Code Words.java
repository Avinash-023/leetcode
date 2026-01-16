class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> res=new HashSet<>();
        String ele="abcdefghijklmnopqrstuvwxyz";
        String[] map={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String str:words){
            String ans="";
            for(char ch:str.toCharArray()){
                int index=ele.indexOf(ch);
                ans+=map[index];
            }
            res.add(ans);
        }
        return res.size();
    }
}
