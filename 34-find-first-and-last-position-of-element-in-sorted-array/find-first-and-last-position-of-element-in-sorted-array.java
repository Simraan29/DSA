class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    int findFirst(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                ans = mid;
                right = mid - 1; // left side jao
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }

    int findLast(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                ans = mid;
                left = mid + 1; // right side jao
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}