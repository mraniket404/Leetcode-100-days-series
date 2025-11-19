public class Day29 {

    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(currsum + nums[i] > nums[i]) {
                currsum += nums[i];
            } else {
                currsum = nums[i];
            }

            max = Math.max(max, currsum);
        }
        return max;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        Day29 obj = new Day29();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + ans);
    }
}
