package problems.data_structers.arrays_and_strings.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            findTripels(nums, nums[i], i+1, nums.length-1, lst);
        }
        return lst;
    }

    public static void findTripels(int[] nums, int val, int left, int right, List<List<Integer>> lst){
        int i = left, j = right;
        while (i < j){
            int sum = nums[i] + nums[j];
            if (val + sum == 0){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(val);
                temp.add(nums[i]);
                temp.add(nums[j]);
                lst.add(temp);
                i++;
                j--;
            }
            else if (val + sum < 0){
                i++;
            }
            else{
                j--;
            }
            while (i > left && i < j && nums[i] == nums[i-1]){
                i++;
            }
            while (j < right && j > i && nums[j] == nums[j+1]){
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] temp = {-1,0,1,2,-1,-4};
        List<List<Integer>> lst = threeSum(temp);
        System.out.println(lst.toString());
    }
}
