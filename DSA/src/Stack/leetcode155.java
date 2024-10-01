//class MinStack {
//    Stack <Integer> stack1 = new Stack<>();
//    Stack <Integer> stack2 = new Stack<>();
//
//    public MinStack() {
//
//    }
//
//    public void push(int val) {
//        stack1.push(val);
//
//        if(stack2.size() == 0){
//            stack2.push(val);
//        }
//        else{
//            if(stack2.peek() >= val){
//                stack2.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        int elem = stack1.pop();
//        if(stack2.peek() == elem) stack2.pop();
//    }
//
//    public int top() {
//        return stack1.peek();
//    }
//
//    public int getMin() {
//        return stack2.peek();
//    }
//}
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(val);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */
