class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> mn=new ArrayList<>();
        List<Integer> mx=new ArrayList<>();
        for(int row=0;row<matrix.length;row++){
            int ele=Integer.MAX_VALUE;
            for(int col=0;col<matrix[0].length;col++){
                int a=matrix[row][col];
                ele=Math.min(ele,a);
            }
            mn.add(ele);
        }
        for(int col=0;col<matrix[0].length;col++){
            int ele=Integer.MIN_VALUE;
            for(int row=0;row<matrix.length;row++){
                int a=matrix[row][col];
                ele=Math.max(ele,a);
            }
            mx.add(ele);
        }
        List<Integer> res=new ArrayList<>();
        for(int i:mn){
            if(mx.contains(i)){
                res.add(i);
            }
        }
        return res;

    }
}
