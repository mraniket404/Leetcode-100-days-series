// 🚀 Day 22 of #100DaysOfLeetCode
// 🔹 Problem: Find First and Last Position of Element in Sorted Array
// 💡 Author: Aniket Santosh Gosavi 💪
// 🎯 Concept: Modified Binary Search (Find Boundaries)

class Day22 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // If array is empty, return [-1, -1]
        if (nums.length == 0) return ans;

        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);

        return ans;
    }

    // Function to find the first occurrence of target
    private int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1, first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1; // keep searching left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    // Function to find the last occurrence of target
    private int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1, last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1; // keep searching right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    // Main method for VS Code testing
    public static void main(String[] args) {
        Day22 obj = new Day22();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
