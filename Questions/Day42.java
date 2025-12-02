import java.util.PriorityQueue;
import java.util.Collections;

public class Day42 {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones){
            pq.add(ele);
        }

        while(pq.size() > 1){
            int max = pq.remove();
            int smax = pq.remove();

            int nstone = max - smax;

            if(nstone != 0){
                pq.add(nstone);
            }
        }

        if(pq.size() == 0)
            return 0;
        else
            return pq.peek();
    }

    // For Testing in VS Code
    public static void main(String[] args) {
        Day42 obj = new Day42();
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println("Last Stone Weight = " + obj.lastStoneWeight(stones));
    }
}
