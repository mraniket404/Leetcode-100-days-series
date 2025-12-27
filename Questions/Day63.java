class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day63 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;

        ListNode ptr = head.next;

        while (ptr != null) {
            if (ptr.val != dummy.val) {
                dummy.next = ptr;
                dummy = dummy.next;
            }
            ptr = ptr.next;
        }

        dummy.next = null; // important to avoid extra links
        return ans;
    }

    public static void main(String[] args) {
        Day63 obj = new Day63();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = obj.deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
