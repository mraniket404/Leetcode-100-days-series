import java.util.Stack;

public class Day54 {

    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else if (!st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else {
                count++;
            }
        }
        return st.size() + count;
    }

    public static void main(String[] args) {
        Day54 obj = new Day54();

        String s1 = "())";
        String s2 = "(((";
        String s3 = "()))((";

        System.out.println(obj.minAddToMakeValid(s1)); // 1
        System.out.println(obj.minAddToMakeValid(s2)); // 3
        System.out.println(obj.minAddToMakeValid(s3)); // 4
    }
}
