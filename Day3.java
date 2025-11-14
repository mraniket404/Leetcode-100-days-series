// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.

public class Day3 {

   
    public int fib(int n) {
      
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int firstNumber = 0;
        int secondNumber = 1;

        
        for (int i = 2; i <= n; i++) {
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        return secondNumber;
    }


    public static void main(String[] args) {
        Day3 obj = new Day3();

        int n = 10; 
        System.out.println("Fibonacci of " + n + " = " + obj.fib(n));
    }
}
