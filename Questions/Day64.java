class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day64 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int carry = 0;

        while (ptr1 != null || ptr2 != null) {
            int val1 = ptr1 != null ? ptr1.val : 0;
            int val2 = ptr2 != null ? ptr2.val : 0;

            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            dummy.next = new ListNode(digit);
            dummy = dummy.next;

            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;
        }

        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }

        return ans.next;
    }

    public static void main(String[] args) {
        Day64 obj = new Day64();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = obj.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
