class Solution {
    public int[] minOperations(String boxes) {
        int[] res=new int[boxes.length()];
        int n=boxes.length();
        int index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    count+=Math.abs(i-j);
                }
            }
            res[index++]=count;
        }
        return res;
    }
}
