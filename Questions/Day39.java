import java.util.Stack;

public class Day39 {

    static class MyQueue {
        private Stack<Integer> input;
        private Stack<Integer> output;

        public MyQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }

        // Push element x to the back of queue.
        public void push(int x) {
            input.push(x);
        }

        // Removes the element from in front of queue and returns it.
        public int pop() {
            shiftStacks();
            return output.pop();
        }

        // Get the front element.
        public int peek() {
            shiftStacks();
            return output.peek();
        }

        // Returns whether the queue is empty.
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }

        // Move elements only when output is empty
        private void shiftStacks() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
        }
    }

    // Test in VS Code
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.pop());   // 10
        System.out.println(q.peek());  // 20
        System.out.println(q.empty()); // false
    }
}
