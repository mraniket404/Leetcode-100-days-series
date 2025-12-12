public class Day48 {
    public int compress(char[] chars) {

        int write = 0;      
        int anchor = 0;    

        for (int read = 0; read < chars.length; read++) {

            if (read + 1 == chars.length || chars[read] != chars[read + 1]) {

                chars[write++] = chars[anchor];  

                int count = read - anchor + 1;   

                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[write++] = c;      
                    }
                }

                anchor = read + 1;  
            }
        }

        return write;
    }

    public static void main(String[] args) {
        Day48 sol = new Day48();

        char[] arr = {'a','a','b','b','c','c','c'};
        int len = sol.compress(arr);

        System.out.println("New Length: " + len);
        System.out.print("Compressed Output: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
    }
}
