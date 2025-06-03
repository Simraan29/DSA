class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result; 
        
    
// ye two pointer approach hai
 
}
}



/*
// hum isko brute force se bhi ker sakte hai

int n= nums.length;
int result[] = new int[n];

for(int i=0; i<n; i++){
     result[i] = nums[i] * nums[i];
}
Arrays.sort(result);
return result; */