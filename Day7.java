import java.util.*;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] num = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Create object and call method
        Solution sol = new Solution();
        List<Integer> result = sol.addToArrayForm(num, k);

        // Output result
        System.out.println("Array-form after adding k: " + result);
    }
}

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;

        // Perform addition digit by digit (from right to left)
        while (p >= 0 || k > 0) {
            int numVal = 0;
            if (p >= 0) {
                numVal = num[p];
            }

            int d = k % 10;              // Last digit of k
            int sum = numVal + d + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ans.add(digit);

            p--;                         // Move to previous digit
            k = k / 10;                  // Remove last digit from k
        }

        // If carry remains, add it
        if (carry > 0) {
            ans.add(carry);
        }

        // Reverse to get correct order
        Collections.reverse(ans);

        return ans;
    }
}
