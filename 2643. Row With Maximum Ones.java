class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxone=0;
        int index=0;
        int[] res=new int[2];
        for(int row=0;row<mat.length;row++){
            int count=0;
            for(int col=0;col<mat[0].length;col++){
                if(mat[row][col]==1){
                    count++;
                }
            }
            if(count>maxone){
                index=row;
                maxone=count;
            }

        }
        res[0]=index;
        res[1]=maxone;
        return res;
    }
}
