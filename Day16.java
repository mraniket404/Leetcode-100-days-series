// 🚀 Day 16 of #100DaysOfLeetCode — Cracking the “Largest Number At Least Twice of Others” Challenge! 💪
// Continuing my journey in Edslash’s “DSA with Edslash – 100 Days of LeetCode” program! ⚙️
//
// 💡 Problem:
// You’re given an integer array nums, where one element is the largest.
// A number is dominant if it is at least twice as large as every other number in the array.
// Return the index of the dominant number, or -1 if no such element exists.
//
// 🔹 Concept:
// 1️⃣ Find the maximum and second maximum elements.
// 2️⃣ A number can only be dominant if it’s ≥ 2 × second maximum.
// 3️⃣ If true, return its index; else, return -1.
//
// ✅ Time Complexity: O(n)
// ✅ Space Complexity: O(1)

class Day16 {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int maxIdx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                maxIdx = i;
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }

        if (smax * 2 <= max) {
            return maxIdx;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Day16 obj = new Day16();
        int[] nums = {3, 6, 1, 0};
        int result = obj.dominantIndex(nums);
        System.out.println("Dominant Index: " + result);
    }
}
