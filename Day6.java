// 🚀 Day 6: Two Sum


import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Compute result
        Solution sol = new Solution();
        int[] ans = sol.twoSum(nums, target);

        // Output result
        System.out.println("Indices: [" + ans[0] + ", " + ans[1] + "]");
        sc.close();
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // 🔹 Loop through the array once (O(n))
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the number and its index to the map
            map.put(nums[i], i);
        }

        // No solution found (as per problem guarantee, won't reach here)
        throw new IllegalArgumentException("No two sum solution");
    }
}
