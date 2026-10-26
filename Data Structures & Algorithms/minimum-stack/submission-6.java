class MinStack {
    Stack<Integer>st;
    Stack<Integer>ms;
    public MinStack() {
        st=new Stack<>();
        ms=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(ms.isEmpty()||ms.peek()>=val)ms.push(val);
    }
    
    public void pop() {
        int i=st.pop();
        if(!ms.isEmpty() && ms.peek()==i)ms.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(!ms.isEmpty())return ms.peek();
        return -1;
    }
}
