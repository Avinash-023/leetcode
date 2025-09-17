class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map1=new HashMap<>();
        int count=0;
        for(String i:words2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:words1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(String val:words1){
            if(Arrays.asList(words2).contains(val) && map.get(val)==1 && map1.get(val)==1){
                count++;
            }
        }
        return count;
    }
}
