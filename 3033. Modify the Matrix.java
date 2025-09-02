class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] answer=new int[matrix.length][matrix[0].length];
        for(int col=0;col<matrix[0].length;col++){
            int max=Integer.MIN_VALUE;
            for(int row=0;row<matrix.length;row++){
                if(matrix[row][col]!=-1){
                    max=Math.max(max,matrix[row][col]);
                }
            }
            for(int row=0;row<matrix.length;row++){
                if(matrix[row][col]==-1){
                    answer[row][col]=max;
                }
                else{
                    answer[row][col]=matrix[row][col];
                }
            }

        }
        return answer;
    }
}
