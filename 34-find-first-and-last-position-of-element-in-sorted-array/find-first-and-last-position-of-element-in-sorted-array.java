public class Solution {

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[] {first, last};
    }

    // Binary search for first occurrence
    public static int findFirst(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) index = mid;
        }

        return index;
    }

    // Binary search for last occurrence
    public static int findLast(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = end + (start - end) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) index = mid;
        }

        return index;
    }

  /*  public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }*/
}
