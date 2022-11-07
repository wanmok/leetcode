class MinStack {
    Deque<Integer> stack;
    int min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if (x < min)
            min = x;
        stack.offerLast(x);
    }
    
    public void pop() {
        stack.removeLast();
        setMin();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return min;
    }
    
    private void setMin() {
        min = Integer.MAX_VALUE;
        for (Integer num : stack)
            if (num < min)
                min = num;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */