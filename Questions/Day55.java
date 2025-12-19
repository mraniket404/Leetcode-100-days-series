public class Day55 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)]--;
            if (arr[t.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Day55 obj = new Day55();

        System.out.println(obj.isAnagram("anagram", "nagaram")); // true
        System.out.println(obj.isAnagram("rat", "car"));         // false
    }
}
