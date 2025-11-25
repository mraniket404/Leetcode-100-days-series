import java.util.PriorityQueue;

public class Day35 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int ans = findKthLargest(nums, k);
        System.out.println("Kth Largest: " + ans);
    }

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int n : nums) {
            if (pq.size() < k) {
                pq.offer(n);
            } else if (n > pq.peek()) {
                pq.poll();
                pq.offer(n);
            }
        }

        return pq.peek();
    }
}
