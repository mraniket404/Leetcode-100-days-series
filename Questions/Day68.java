class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day68 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        // Move fast pointer n steps ahead
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        // If fast reaches null, remove head
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until fast reaches last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove nth node from end
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Day68 obj = new Day68();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = obj.removeNthFromEnd(head, 2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
