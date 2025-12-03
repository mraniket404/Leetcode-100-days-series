public class Day43 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i]; // right sum after removing current

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }

    // 🌟 Main method for testing in VS Code
    public static void main(String[] args) {
        Day43 obj = new Day43();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index: " + obj.pivotIndex(nums));
    }
}
