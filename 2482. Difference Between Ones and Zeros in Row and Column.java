class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] rowone=new int[m];
        int[] colone=new int[n];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
            rowone[i]=count;
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(grid[j][i]==1){
                    count++;
                }
            }
            colone[i]=count;
        }
        int[][] diff=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int rowzero=m-rowone[i];
                int colzero=n-colone[j];
                int ele=rowone[i]+colone[j]-rowzero-colzero;
                diff[i][j]=ele;
            }
        }
        return diff;
    }
}
