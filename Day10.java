class Day10 {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int actualSum = (range * (range + 1)) / 2;
        
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
        }
        
        return actualSum - currentSum;
    }
    
    public static void main(String[] args) {
        Day10 solution = new Day10();
        
        // Test cases
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        
        System.out.println("Missing number in [3, 0, 1]: " + solution.missingNumber(nums1));
        System.out.println("Missing number in [0, 1]: " + solution.missingNumber(nums2));
        System.out.println("Missing number in [9, 6, 4, 2, 3, 5, 7, 0, 1]: " + solution.missingNumber(nums3));
        System.out.println("Missing number in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]: " + solution.missingNumber(nums4));   
    }
}