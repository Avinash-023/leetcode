class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        for(int row=0;row<mat.length;row++){
            ans+=mat[row][row];
        }
        int rw=0;
        for(int col=mat.length-1;col>=0;col--){
                ans+=mat[rw][col];
                rw++;
        }
        if(mat.length%2!=0){
            int mid=1+mat.length/2;
            ans-=mat[mid-1][mid-1];
        }
        return ans;
    }
}
