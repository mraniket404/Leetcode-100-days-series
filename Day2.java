// 🚀 Day 2: Power of Two
// LeetCode Problem: Given an integer n, return true if it is a power of two.
// Author: Aniket Santosh Gosavi

class Day2 {
    public boolean isPowerOfTwo(int n) {
        // Step 1: Negative or zero numbers can never be powers of two
        if (n < 1) {
            return false;
        } 
        // Step 2: 1 is 2^0, which is a power of two
        else if (n == 1) {
            return true;
        } 
        // Step 3: Keep dividing by 2 while it's even
        else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            // Step 4: If at the end n becomes 1, it's a power of two
            return n == 1;
        }
    }

    // ✅ Test function
    public static void main(String[] args) {
        Day2 sol = new Day2();

        int[] testCases = {1, 2, 3, 4, 8, 16, 18, 64, 100};
        for (int n : testCases) {
            System.out.println("Is " + n + " a power of two? → " + sol.isPowerOfTwo(n));
        }
    }
}
