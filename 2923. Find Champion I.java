class Solution {
    public int findChampion(int[][] grid) {
        int res=0;
        int no=0;
        for(int row=0;row<grid.length;row++){
            int count=0;
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    count++;
                }
            }
            if(count>no){
                res=row;
                no=count;
            }
        }
        return res;
    }
}
