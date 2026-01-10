class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        Arrays.fill(res,0);
        if(k==0){
            return res;
        }
        else if(k<0){
            k=Math.abs(k);
            for(int i=res.length-1;i>=0;i--){
                int l=i-1;
                int sum=0;
                int n=k;
                while(n>0){
                    sum+=code[(l+code.length)%code.length];
                    System.out.println(sum);
                    l--;
                    n--;
                }
                res[i]=sum;
            }
        }
        else{
            for(int i=0;i<res.length;i++){
            int l=i+1;
            int sum=0;
            int n=k;
            while(n>0){
                sum+=code[l%code.length];
                System.out.println(sum);
                l++;
                n--;
            }
            res[i]=sum;
        }
        }
        
        return res;
    }
}
