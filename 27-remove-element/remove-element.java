class Solution {
    public static int removeElement(int[] nums, int val) {
        int ptr = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[ptr] = nums[i];
                ptr++;
            }
            
        }
        return ptr;
        
    }

   /* public static void main(String args[]){
      
        int nums[] = {3,2,2,3};
        int val = 3;
        System.out.println( removeElement(nums,val));
        int nums2[] = { 0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println( removeElement(nums2,val2));
    } */
}