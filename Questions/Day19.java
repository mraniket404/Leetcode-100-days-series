
// Challenge: Given an array of positive integers nums, return the maximum possible sum
// of a strictly increasing subarray in nums.

import java.util.*;

class Day19 {

    // Function to find maximum ascending subarray sum
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currmax += nums[i]; // continue the ascending sequence
            } else {
                currmax = nums[i]; // reset for new sequence
            }
            max = Math.max(max, currmax); // track the best sum so far
        }
        return max;
    }

    // 🔹 Main method for testing in VS Code terminal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day19 obj = new Day19();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = obj.maxAscendingSum(nums);
        System.out.println("Maximum Ascending Subarray Sum = " + result);

        sc.close();
    }
}
