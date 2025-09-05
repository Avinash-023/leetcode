class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] res=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int maxval=Integer.MIN_VALUE;
                for(int row=i;row<i+3;row++){
                    for(int col=j;col<j+3;col++){
                        maxval=Math.max(maxval,grid[row][col]);
                    }
                }
                res[i][j]=maxval;
            }
        }
        return res;
    }
}
