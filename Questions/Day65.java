class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day65 {

    public ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public ListNode doubleIt(ListNode head) {
        ListNode nhead = reverseLL(head);

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        int carry = 0;

        while (nhead != null) {
            int sum = nhead.val + nhead.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            dummy.next = new ListNode(digit);
            dummy = dummy.next;
            nhead = nhead.next;
        }

        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }

        return reverseLL(ans.next);
    }

    public static void main(String[] args) {
        Day65 obj = new Day65();

        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);

        ListNode result = obj.doubleIt(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
