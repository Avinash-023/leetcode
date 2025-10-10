class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && Character.isUpperCase(ch) && st.peek()==Character.toLowerCase(ch)){
                st.pop();
            }
            else if(!st.isEmpty() && Character.isLowerCase(ch) && st.peek()==Character.toUpperCase(ch)){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}
