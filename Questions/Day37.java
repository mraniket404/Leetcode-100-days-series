import java.util.Stack;

class Day37 {

    private Stack<Integer> st;
    private Stack<Integer> min;

    public Day37() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        st.push(val);
    }

    public void pop() {
        if (st.peek().equals(min.peek())) {
            min.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    // -------------------------
    // TESTING MAIN METHOD
    // -------------------------
    public static void main(String[] args) {
        Day37 obj = new Day37();

        obj.push(5);
        obj.push(2);
        obj.push(7);
        obj.push(1);

        System.out.println("Top = " + obj.top());
        System.out.println("Min = " + obj.getMin());

        obj.pop();  // removes 1

        System.out.println("Top = " + obj.top());
        System.out.println("Min = " + obj.getMin());
    }
}
