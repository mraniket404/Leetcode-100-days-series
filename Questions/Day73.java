import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day73 {

    public static int sizeLL(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] ans = new int[size];

        ListNode revHead = reverseLL(head);
        Stack<Integer> st = new Stack<>();

        st.push(revHead.val);
        ListNode curr = revHead.next;
        int idx = size - 2;

        while (idx >= 0) {
            int val = curr.val;
            curr = curr.next;

            while (!st.isEmpty() && st.peek() <= val) {
                st.pop();
            }

            ans[idx] = st.isEmpty() ? 0 : st.peek();
            st.push(val);
            idx--;
        }
        return ans;
    }

    // 🔥 MAIN METHOD FOR VS CODE
    public static void main(String[] args) {
        // Test case: [2,1,5]
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);

        int[] result = nextLargerNodes(head);

        System.out.print("Output: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
