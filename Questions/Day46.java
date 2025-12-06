import java.util.*;

public class Day46 {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] inStack = new boolean[26]; 
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (inStack[idx]) continue;

            while (!stack.isEmpty() && stack.peek() > ch && lastIndex[stack.peek() - 'a'] > i) {
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            inStack[idx] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) result.append(c);

        return result.toString();
    }

    public static void main(String[] args) {
        Day46 obj = new Day46();
        System.out.println(obj.removeDuplicateLetters("bcabc"));     
        System.out.println(obj.removeDuplicateLetters("cbacdcbc")); 
    }
}
