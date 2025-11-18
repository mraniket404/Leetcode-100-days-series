public class Day28 {

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, high, mid);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        Day28 obj = new Day28();

        int[] nums = {2, 0, 2, 1, 1, 0};
        obj.sortColors(nums);

        System.out.print("Sorted Colors: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
