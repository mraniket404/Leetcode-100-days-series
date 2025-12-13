import java.util.Stack;

public class Day49 {
    public static String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numberStack.push(num);
            } else if (ch != ']') {
                stringStack.push(String.valueOf(ch));
            } else {
                StringBuilder part = new StringBuilder();
                while (!stringStack.peek().equals("[")) {
                    part.insert(0, stringStack.pop());
                }
                stringStack.pop();

                int repeat = numberStack.pop();
                StringBuilder expanded = new StringBuilder();
                while (repeat-- > 0) {
                    expanded.append(part);
                }
                stringStack.push(expanded.toString());
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stringStack.isEmpty()) {
            result.insert(0, stringStack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
