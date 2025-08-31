class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid.length;col++){
                if(row==col || row==n-1-col){
                    if(grid[row][col]==0){
                        return false;
                    }
                }
                else{
                    if(grid[row][col]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
