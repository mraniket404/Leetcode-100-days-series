public class Day51 {

    public static int maxPower(String s) {
        int max = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        return Math.max(max, count);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(maxPower(s));
    }
}
