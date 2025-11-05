 //  Day 15: Bulb Switcher
//  Challenge: Find the number of bulbs that are ON after n rounds



import java.util.*;

public class Day15 {
    public static int bulbSwitch(int n) {
        int count = 0;
        int i = 1;

        while (i * i <= n) {
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bulbs (n): ");
        int n = sc.nextInt();

        int result = bulbSwitch(n);
        System.out.println("Number of bulbs ON after " + n + " rounds: " + result);
    }
}
