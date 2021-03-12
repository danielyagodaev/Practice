package problems.data_structers.arrays_and_strings.first_missing_positive;

public class Solution {

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length){
            if (nums[i] != i + 1) {
                if (nums[i] > 0 && nums[i] <= nums.length) {
                    int curr = nums[i];
                    if (nums[curr - 1] != curr) {
                        int temp = nums[curr - 1];
                        nums[curr - 1] = curr;
                        nums[i] = temp;
                        continue;
                    }
                }
                nums[i] = 0;
            }
            i++;
        }
        i=0;
        while (i<nums.length && nums[i] != 0){
            i++;
        }
        return i+1;
    }
}
