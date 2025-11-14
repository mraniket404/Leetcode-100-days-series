// 🚀 Day12 - Squares of a Sorted Array
// Problem: Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number, also sorted in non-decreasing order.

class Day12 {
    public int[] sortedSquares(int[] nums) {

        // Result array to store sorted squares
        int[] ans = new int[nums.length];
        
        // Two pointers at both ends
        int start = 0;
        int end = nums.length - 1;
        
        // Pointer for filling the result array from the end
        int ptr = ans.length - 1;

        // Compare squares from both ends
        while (start <= end) {
            int ss = nums[start] * nums[start]; // square of start
            int es = nums[end] * nums[end];     // square of end

            // Place the larger square at the current position
            if (ss > es) {
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = es;
                end--;
            }

            ptr--; // Move pointer leftwards
        }

        return ans; 
    }

    // Optional main method for quick testing in VS Code
    public static void main(String[] args) {
        Day12 obj = new Day12();
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = obj.sortedSquares(nums);

        System.out.print("Sorted Squares: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
