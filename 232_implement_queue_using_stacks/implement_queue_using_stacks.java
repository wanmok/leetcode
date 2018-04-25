class MyQueue {

    private List<Integer> stack;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (! empty()) {
            int res = peek();
            stack.remove(0);
            return (res);
        }
        return (-1);
    }
    
    /** Get the front element. */
    public int peek() {
        if (! empty()) {
            int res = stack.get(0);
            return (res);
        }
        return (-1);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (stack.size() == 0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */