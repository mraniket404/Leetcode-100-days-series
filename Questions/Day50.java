public class Day50 {

    public static boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                freq[word.charAt(i) - 'a']++;
            }
        }

        int n = words.length;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % n != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "aabc", "bc"};
        System.out.println(makeEqual(words));
    }
}
