// Given an integer x, return true if x is a palindrome, and false otherwise.
class Day1 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;  // Negative numbers kabhi palindromes nhi hota
        }

        int n = x;   // Copy original number
        int rev = 0; //  store the reversed number

        // Reverse the number
        while (n > 0) {
            int d = n % 10;     // Extract last digit
            rev = rev * 10 + d; // Build reversed number
            n = n / 10;         // Remove last digit
        }

        // Compare reversed and original numbers
        return rev == x;
    }


//    for testing 
    public static void main(String[] args) {
        Day1 obj = new Day1();

      
        System.out.println(obj.isPalindrome(121));  
        System.out.println(obj.isPalindrome(-121)); 
        System.out.println(obj.isPalindrome(10));   
        System.out.println(obj.isPalindrome(1221)); 
        System.out.println(obj.isPalindrome(12345));
    }
}
