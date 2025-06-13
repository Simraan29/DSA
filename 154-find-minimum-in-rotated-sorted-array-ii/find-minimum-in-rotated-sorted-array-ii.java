class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
        int start = 0;
        int end =  n-1;

        while(end > start){
            int mid = (start + end)/2;
            if(nums[mid]<nums[end]){
                end = mid;
                }else if(nums[mid]> nums[end]){
                    start = mid +1;
                }else{
                    end--;
                }
            
            
        }
        return nums[start];
        
    }
}