class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day67 {

    public int sizeLL(ListNode head) {
        int count = 0;
        ListNode ptr = head;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        int size1 = sizeLL(headA);
        int size2 = sizeLL(headB);
        int diff = size1 - size2;

        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if (diff > 0) { // list A is longer
            while (diff > 0) {
                ptr1 = ptr1.next;
                diff--;
            }
        } else { // list B is longer
            while (diff < 0) {
                ptr2 = ptr2.next;
                diff++;
            }
        }

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }

    public static void main(String[] args) {
        Day67 obj = new Day67();

        // Common intersection
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A: 4 -> 1 -> 8 -> 4 -> 5
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode result = obj.getIntersectionNode(headA, headB);
        System.out.println(result != null ? result.val : "No intersection");
    }
}
