public class Day11 {
    public int removeElement(int[] nums, int val) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }

    // For quick testing
    public static void main(String[] args) {
        Day11 obj = new Day11();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = obj.removeElement(nums, val);
        System.out.println("Number of elements not equal to " + val + ": " + k);

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
