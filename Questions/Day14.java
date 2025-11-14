//  Day 14 of #100DaysOfLeetCode — Mastering “Product of Array Except Self”
//  Challenge: Find the product of all elements except self (no division, O(n) time)
//  Concept: Prefix-Suffix Product Approach

class Day14 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];  // stores product of elements to the right
        int pro = 1;

        // Step 1: Build right-side cumulative product
        for (int i = n - 1; i >= 0; i--) {
            pro = pro * nums[i];
            right[i] = pro;
        }

        int[] ans = new int[n];
        int left = 1;

        // Step 2: Calculate final answer using left and right products
        for (int i = 0; i < n - 1; i++) {
            ans[i] = left * right[i + 1];
            left = left * nums[i];
        }

        // Step 3: Last element (no right product available)
        ans[n - 1] = left;

        return ans;
    }

    // Optional: Main method for quick testing in VS Code
    public static void main(String[] args) {
        Day14 obj = new Day14();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
