import java.util.LinkedList;
import java.util.Queue;

class Day38 {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public Day38() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
        // Move all elements from main to helper
        while (!main.isEmpty()) {
            helper.add(main.remove());
        }

        // Add new element to main
        main.add(x);

        // Move everything back to main
        while (!helper.isEmpty()) {
            main.add(helper.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }

    // Test code for VS Code
    public static void main(String[] args) {
        Day38 stack = new Day38();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());   // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("Top: " + stack.top());   // 20
        System.out.println("Empty: " + stack.empty()); // false
    }
}
