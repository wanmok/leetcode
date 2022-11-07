class MyStack {
    private Deque<Integer> q;

    /** Initialize your data structure here. */
    public MyStack() {
        this.q = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        this.q.offerLast(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.pollLast();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peekLast();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */