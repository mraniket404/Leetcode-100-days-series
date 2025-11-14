// Day17.java
class Day17 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            int hi = height[i];
            int hj = height[j];
            int min = hi < hj ? hi : hj;
            int area = (j - i) * min;
            if (area > max) max = area;

            // Move the pointer at smaller height inward
            if (hi < hj) {
                while (i < j && height[i] <= hi) i++; 
            } else {
                while (i < j && height[j] <= hj) j--; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Day17 sol = new Day17();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("💧 Maximum Water Area: " + sol.maxArea(height));
    }
}
