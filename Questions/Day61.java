import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day61 {

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();

        ListNode ptr = head;
        while (ptr != null) {
            st.push(ptr.val);
            ptr = ptr.next;
        }

        ListNode ptr2 = head;
        while (ptr2 != null) {
            int val1 = ptr2.val;
            int val2 = st.pop();

            if (val1 != val2) {
                return false;
            }
            ptr2 = ptr2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Day61 obj = new Day61();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(obj.isPalindrome(head)); // true
    }
}
