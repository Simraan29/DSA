class Solution {
    public int findPeakElement(int[] nums) {
        int n= nums.length;
        int start =0;
        int  end = n-1;
        while(end>start){
            int mid = (start + end)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
        
    }
}