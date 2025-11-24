import java.util.Arrays;

class Day34 {

    public int[] plusOne(int[] digits) {

        int n = digits.length;

        if (digits[n - 1] != 9) {
            digits[n - 1] = digits[n - 1] + 1;
            return digits;
        }

        digits[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {

            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[n + 1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String[] args) {

        Day34 obj = new Day34();

        int[] digits = {9, 9, 9};

        int[] result = obj.plusOne(digits);

        System.out.println(Arrays.toString(result));
    }
}
