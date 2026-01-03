import java.util.Stack;

class MyQueue {

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    // Constructor
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Push element to back of queue
    public void push(int x) {
        inStack.push(x);
    }

    // Removes element from front of queue
    public int pop() {
        moveIfNeeded();
        return outStack.pop();
    }

    // Get front element
    public int peek() {
        moveIfNeeded();
        return outStack.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Helper method
    private void moveIfNeeded() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
