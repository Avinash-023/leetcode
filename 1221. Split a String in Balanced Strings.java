class Solution {
    public int balancedStringSplit(String s) {
        int var=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='L'){
                var++;
            }
            else{
                var--;
            }
            if(var==0){
                count++;
            }
        }
        return count;
    }
}
