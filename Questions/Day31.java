import java.util.*;

public class Day31 {

    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;      // count of numbers < target
        int count = 0;     // count of numbers == target

        // Count occurrences and numbers smaller than target
        for (int x : nums) {
            if (x == target) count++;
            else if (x < target) less++;
        }

        // Build result list
        List<Integer> result = new ArrayList<>();
        while (count-- > 0) {
            result.add(less);
            less++;
        }

        return result;
    }

    public static void main(String[] args) {
        Day31 obj = new Day31();

        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        System.out.println(obj.targetIndices(nums, target));  // output: [1, 2]
    }
}
