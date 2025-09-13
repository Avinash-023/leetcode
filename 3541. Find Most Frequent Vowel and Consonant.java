class Solution {
    public int maxFreqSum(String s) {
        String a="aeiou";
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(a.contains(Character.toString(ch))){
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
            else{
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
        }
        int mx1=0;
        for(int val:map1.values()){
            mx1=Math.max(mx1,val);
        }
        int mx2=0;
        for(int val:map2.values()){
            mx2=Math.max(mx2,val);
        }
        return mx1+mx2;
    }
}
