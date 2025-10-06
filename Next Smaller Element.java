class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>(n);
        for (int i = 0; i < n; i++) ans.add(-1);
        ArrayDeque<Integer>st=new ArrayDeque<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
