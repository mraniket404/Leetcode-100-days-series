import java.util.*;

public class Day33 {

    public static void main(String[] args) {
        // ------- TEST CODE HERE -------
        int[] nums = {-5, -3, -1, 0, 2, 4, 8};

        Day33 obj = new Day33();
        int result = obj.maximumCount(nums);

        System.out.println("Maximum Count = " + result);
        // --------------------------------
    }

    public int maximumCount(int[] nums) {
        int negCount = countNegatives(nums);
        int posCount = countPositives(nums);
        return Math.max(negCount, posCount);
    }

    // Last index of negative number
    private int countNegatives(int[] nums) {
        int start = 0, end = nums.length - 1;
        int lastNeg = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] < 0) {
                lastNeg = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return lastNeg + 1;
    }

    // First index of positive number
    private int countPositives(int[] nums) {
        int start = 0, end = nums.length - 1;
        int firstPos = nums.length;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] > 0) {
                firstPos = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return nums.length - firstPos;
    }
}
