// 🚀 Day 4 - Tribonacci Number
// LeetCode Problem: The Tribonacci sequence Tn is defined as follows:
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Given n, return the value of Tn.


public class Day4 {
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int firstNumber = 0;
            int secondNumber = 1;
            int thirdNumber = 1;

            for (int i = 3; i <= n; i++) {
                int nextNumber = firstNumber + secondNumber + thirdNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                thirdNumber = nextNumber;
            }
            return thirdNumber;
        }
    }

    public static void main(String[] args) {
        int n = 25; 
        System.out.println("Tribonacci of " + n + " is: " + tribonacci(n));
    }
}
