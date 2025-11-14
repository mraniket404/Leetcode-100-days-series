// 🚀 Day 20 of #100DaysOfLeetCode — Find Lucky Integer in an Array
// Concept: Frequency-based pattern recognition using array counting.

public class Day20 {
    public static int findLucky(int[] arr) {
        int[] freq = new int[501]; // Constraint: 1 <= arr[i] <= 500

        for (int num : arr) {
            freq[num]++;
        }

        int ans = -1;
        for (int i = 1; i <= 500; i++) {
            if (freq[i] == i) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println("Largest Lucky Integer: " + findLucky(arr));
    }
}
