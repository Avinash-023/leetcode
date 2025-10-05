class MinStack {
    Stack<List<Integer>> st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        int min;
        if(st.isEmpty()){
            min=val;
        }
        else{
            min=Math.min(val,st.peek().get(1));
        }
        int x=val;
        int y=min;
        List<Integer>pairs=Arrays.asList(x,y);
        st.push(pairs);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().get(0);
    }
    
    public int getMin() {
        return st.peek().get(1);
    }
}

