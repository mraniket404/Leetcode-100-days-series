public class Day32 {
    public String largestNumber(int[] nums) {

        int n = nums.length;
        String[] arr = new String[n];

        // Convert int → String
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.toString(nums[i]);
        }

        // Custom comparator for largest number
        java.util.Arrays.sort(arr, new java.util.Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b); 
            }
        });

        // If highest number is "0", result is "0"
        if (arr[0].charAt(0) == '0') return "0";

        // Build final number
        StringBuilder sb = new StringBuilder(32);
        for (String s : arr) sb.append(s);

        return sb.toString();
    }

    // For testing in VS Code
    public static void main(String[] args) {
        Day32 obj = new Day32();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(obj.largestNumber(nums));  // Output: 9534330
    }
}
