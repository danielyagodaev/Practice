package problems.data_structers.arrays_and_strings.longest_consecutive_sequence;

import java.util.HashSet;

public class Solution {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> allNums = new HashSet<>();
        for (int num : nums){
            allNums.add(num);
        }
        int i=0, maxCount = 0;
        while(i<nums.length && !allNums.isEmpty()){
            int currNum = nums[i++];
            if (allNums.contains(currNum)){
                allNums.remove(currNum);
                int count=1;
                int prev=currNum-1, next=currNum+1;
                while(allNums.contains(prev)){
                    allNums.remove(prev);
                    count++;
                    prev--;
                }
                while(allNums.contains(next)){
                    allNums.remove(next);
                    count++;
                    next++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

}
