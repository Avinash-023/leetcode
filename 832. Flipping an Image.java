class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int n=image[i].length;
            int t=0;
            for(int j=n-1;j>=0;j--){
                if(image[i][j]==1){
                    arr[i][t]=0;
                    t++;
                }
                else{
                    arr[i][t]=1;
                    t++;
                }
            }
        }
        return arr;
    }
}
