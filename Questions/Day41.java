public class Day41 {

    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];

        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }

    public static void main(String[] args) {
        Day41 sol = new Day41();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(sol.findDuplicate(nums));
    }
}
