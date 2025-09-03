class Solution {
    public int minimumOperations(int[][] grid) {
        int count=0;
        for(int col=0;col<grid[0].length;col++){
            int prev=grid[0][col];
            for(int row=1;row<grid.length;row++){
                int b=grid[row][col];
                while(b<=prev){
                    count++;
                    b+=1;
                }
                prev=b;
            }
        }
        return count;
    }
}
