import java.util.*;

public class Day47 {

    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        String result = reverseWords(input);
        System.out.println("Reversed words:");
        System.out.println(result);
        
        sc.close();
    }
}
