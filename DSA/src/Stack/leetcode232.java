class MyQueue {
    Stack <Integer> stack1 = new Stack <>();
    Stack <Integer> stack2 = new Stack <>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(stack1.size() > 1){
            stack2.push(stack1.pop());
        }
        int elem = stack1.pop();
        while(stack2.size() != 0){
            stack1.push(stack2.pop());
        }
        return elem;
    }
    
    public int peek() {
        while(stack1.size() > 1){
            stack2.push(stack1.pop());
        }
        int elem = stack1.peek();

        while(stack2.size() != 0){
            stack1.push(stack2.pop());
        }
        return elem;
    }
    
    public boolean empty() {
        if(stack1.size() == 0) return true;
        return false;
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
