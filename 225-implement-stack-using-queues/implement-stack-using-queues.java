import java.util.Queue;
import java.util.LinkedList;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    // Constructor
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        // Step 1: push to empty q2
        q2.offer(x);

        // Step 2: move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Step 3: swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the element on top of stack
    public int pop() {
        return q1.poll();
    }

    // Get top element
    public int top() {
        return q1.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}
