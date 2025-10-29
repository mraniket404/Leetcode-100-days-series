//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object and call method
        Solution sol = new Solution();
        int result = sol.maxProduct(nums);

        // Output result
        System.out.println("Maximum Product of (nums[i]-1)*(nums[j]-1) = " + result);
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int secondMax = -1;

        // Find two largest numbers
        for (int n : nums) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax) {
                secondMax = n;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}
