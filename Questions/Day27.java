public class Day27 {

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        } else if(nums[0] != nums[1]){
            return nums[0];
        } else if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            // Unique element found
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            // Mid index is odd
            else if(mid % 2 == 1){
                if(nums[mid] == nums[mid - 1]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Mid index is even
            else {
                if(nums[mid] == nums[mid + 1]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;  // Should never reach here
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println("Single element is: " + singleNonDuplicate(nums));
    }
}
