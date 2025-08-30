class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int row=0;row<matrix.length;row++){
            HashSet<Integer> set=new HashSet<>();
            for(int col=0;col<matrix.length;col++){
                int ele=matrix[row][col];
                set.add(ele);
            }
            if(set.size()!=matrix.length){
                return false;
            }
        }
        for(int col=0;col<matrix.length;col++){
            HashSet<Integer> set2=new HashSet<>();
            for(int row=0;row<matrix.length;row++){
                int ele=matrix[row][col];
                set2.add(ele);
            }
            if(set2.size()!=matrix.length){
                return false;
            }
        }
        return true;
    }
}
