import java.util.Arrays;

public class Day44 {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.parallelSort(people); // Faster sorting

        int i = 0, j = people.length - 1;
        int boats = 0;

        while (i < j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boats++;
        }

        return (i == j) ? boats + 1 : boats;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;

        System.out.println("Minimum Boats Needed: " + numRescueBoats(people, limit));
    }
}
