import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){

            
            if(!set.contains(num - 1)) //hum sirf sequence ke starting point se hi count kare
            {

                int currentNum = num;
                int count = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }

                if(count > longest){
                    longest = count;
                }
            }
        }

        return longest;
    }
}