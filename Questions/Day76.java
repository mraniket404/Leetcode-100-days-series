import java.util.PriorityQueue;

public class Day76 {

    // ListNode definition
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // LeetCode solution logic
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;

            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next;
    }

    // main method (for VS Code run)
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        a1.next = new ListNode(4);
        a1.next.next = new ListNode(5);

        ListNode b1 = new ListNode(1);
        b1.next = new ListNode(3);
        b1.next.next = new ListNode(4);

        ListNode c1 = new ListNode(2);
        c1.next = new ListNode(6);

        ListNode[] lists = {a1, b1, c1};

        ListNode res = mergeKLists(lists);

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
