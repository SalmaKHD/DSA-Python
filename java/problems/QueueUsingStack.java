import java.util.Stack;

class MyQueue {

    Stack<Integer> stack = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        if(!stack.isEmpty()) {
        int firstElement = stack.firstElement();
        stack.remove(stack.firstElement());
        return firstElement;
        } else{
            return -1;
        }
    }
    
    public int peek() {
        if(!stack.isEmpty()) {
            return -1;
        } else {
            return stack.firstElement();
        }
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}