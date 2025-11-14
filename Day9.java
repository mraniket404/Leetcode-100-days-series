public class Day9 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int mid = total >>> 1; 
        
        int i = 0, j = 0;
        int a = 0, b = 0;
        
        for (int k = 0; k <= mid; k++) {
            a = b;
            if (i < m && j < n) {
                b = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            } else if (i < m) {
                b = nums1[i++];
            } else {
                b = nums2[j++];
            }
        }
        
        return (total & 1) == 1 ? b : (a + b) * 0.5;
    }

    public static void main(String[] args) {
        Day9 solution = new Day9();
        
        // Test cases
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Test 1: " + solution.findMedianSortedArrays(nums1, nums2)); 
        
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Test 2: " + solution.findMedianSortedArrays(nums3, nums4)); 
        
        int[] nums5 = {0, 0};
        int[] nums6 = {0, 0};
        System.out.println("Test 3: " + solution.findMedianSortedArrays(nums5, nums6)); 
        
        int[] nums7 = {};
        int[] nums8 = {1};
        System.out.println("Test 4: " + solution.findMedianSortedArrays(nums7, nums8)); 
        
        int[] nums9 = {2};
        int[] nums10 = {};
        System.out.println("Test 5: " + solution.findMedianSortedArrays(nums9, nums10)); 

        int[] nums11 = {1, 2};
        int[] nums12 = {3, 4, 5};
        System.out.println("Test 6: " + solution.findMedianSortedArrays(nums11, nums12));
    }
}