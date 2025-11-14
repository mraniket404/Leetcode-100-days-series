//  Day 13 - Two Sum II (Input Array Is Sorted)
// Approach: Two-Pointer Technique (O(n) Time, O(1) Space)


class Day13 {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1};
            }

            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[0]; 
    }

    //  Test the function
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
