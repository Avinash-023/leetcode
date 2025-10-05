class MyStack {
    private  Queue<Integer> q;
    public MyStack() {
       q=new LinkedList<>();
    }
    
    public void push(int x) {
        int s=q.size();
        q.add(x);
        for(int i=0;i<s;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}

