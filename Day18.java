// Challenge: Return true if there exists a triple (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].

class Day18 {
    public boolean increasingTriplet(int[] nums) {
        // ✅ Quick check to avoid unnecessary processing
        if (nums.length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;        // smallest value so far
            } else if (n <= second) {
                second = n;       // second smallest value so far
            } else {
                return true;      // found triplet: first < second < n
            }
        }
        return false;
    }

    // 🔍 Simple test case for VS Code terminal
    public static void main(String[] args) {
        Day18 obj = new Day18();
        int[] nums1 = {1, 2, 3, 4, 5};     // Expected: true
        int[] nums2 = {5, 4, 3, 2, 1};     // Expected: false
        int[] nums3 = {2, 1, 5, 0, 4, 6};  // Expected: true

        System.out.println("Test 1: " + obj.increasingTriplet(nums1));
        System.out.println("Test 2: " + obj.increasingTriplet(nums2));
        System.out.println("Test 3: " + obj.increasingTriplet(nums3));
    }
}
