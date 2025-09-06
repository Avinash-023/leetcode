class Solution {
    public int countServers(int[][] grid) {
        int[] rows=new int[grid.length];
        int[] cols=new int[grid[0].length];
        for(int row=0;row<grid.length;row++){
            int count=0;
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    count++;
                }
            }
            rows[row]=count;
        }
        for(int col=0;col<grid[0].length;col++){
            int count=0;
            for(int row=0;row<grid.length;row++){
                if(grid[row][col]==1){
                    count++;
                }
            }
            cols[col]=count;
        }
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(rows[i]==1 && cols[j]==1){
                        continue;
                    }
                    else{
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
