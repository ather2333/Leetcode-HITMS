import java.util.Stack;

class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element
    public void push(int val) {
        mainStack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop element
    public void pop() {
        if (mainStack.isEmpty()) return;

        int removed = mainStack.pop();

        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get top element
    public int top() {
        return mainStack.peek();
    }

    // Get minimum element
    public int getMin() {
        return minStack.peek();
    }
}
