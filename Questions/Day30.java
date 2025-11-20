import java.util.*;

public class Day30 {
    // Two-pointer optimized method to compute trapped rain water
    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, ans = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else ans += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }

    // Helper to parse a line of space-separated integers into int[]
    private static int[] parseLineToArray(String line) {
        line = line.trim();
        if (line.isEmpty()) return new int[0];
        String[] parts = line.split("\\s+");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter heights as space-separated integers (e.g. 0 1 0 2 1 0 1 3 2 1 2 1):");
        String line = "";
        if (sc.hasNextLine()) line = sc.nextLine();
        int[] height = parseLineToArray(line);

        int result = trap(height);
        System.out.println("Trapped water = " + result);
        sc.close();
    }
}
