class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> freqs=new HashMap<>();
        HashMap<Character,Integer> freqt=new HashMap<>();
        for(char ch:s.toCharArray()){
            freqs.put(ch,freqs.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            freqt.put(ch,freqt.getOrDefault(ch,0)+1);
        }
        int ans=0;
        for(char key:freqs.keySet()){
            if(freqs.get(key)>freqt.getOrDefault(key,0)){
                ans+=freqs.get(key)-freqt.getOrDefault(key,0);
            }
        }
        return ans;
    }
}
