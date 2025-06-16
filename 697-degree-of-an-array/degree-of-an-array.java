import java.util.*;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> lastIndex = new HashMap<>();
        
        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            
            firstIndex.putIfAbsent(num, i);
           
            lastIndex.put(num, i);
            
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            
            degree = Math.max(degree, freq.get(num));
        }

        int minLength = nums.length;
        for (int num : freq.keySet()) {
            if (freq.get(num) == degree) {
            int len = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLength = Math.min(minLength, len);
            }
        }

        return minLength;
    }
}
