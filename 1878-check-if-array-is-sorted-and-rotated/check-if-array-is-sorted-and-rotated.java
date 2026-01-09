class Solution {
    public boolean check(int[] nums) {
       int breakcount = 0;
       int n = nums.length;
       for(int i=0;i<n; i++){
        if(nums[i] > nums[(i+1)%n]){ // (i + 1) % n → circular comparison
            breakcount++;
        }
       }
       return breakcount <=1;
        
    }
}