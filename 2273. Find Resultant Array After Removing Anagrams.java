class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res=new ArrayList<>();
        for(String s:words){
            if(res.isEmpty()){
                res.add(s);
            }
            else{
                String lw=res.get(res.size()-1);
                char[] arr1=lw.toCharArray();
                char[] arr2=s.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if(!Arrays.equals(arr1,arr2)){
                    res.add(s);
                }
            }
        }
        return res;
    }
}
