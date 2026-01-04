class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day71 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode ptr = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) { // cycle detected
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr; // cycle starting node
            }
        }
        return null; // no cycle
    }

    public static void main(String[] args) {
        Day71 obj = new Day71();

        // Create cycle: 3 -> 2 -> 0 -> -4 -> back to 2
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        ListNode cycleNode = obj.detectCycle(head);
        System.out.println(cycleNode != null ? cycleNode.val : "No Cycle");
    }
}
