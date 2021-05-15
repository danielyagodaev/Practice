package problems.recursion_and_dynamic_programming.largest_component_size_by_common_factor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public int largestComponentSize(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxGroupSize = 0;
        HashMap<Integer, Integer> groups = new HashMap<>();
        HashMap<Integer, Integer> groupsSize = new HashMap<>();
        for (int i=0; i<n; i++){
            List<Integer> nodes = new ArrayList<>();
            nodes.add(nums[i]);
            while (!nodes.isEmpty()){
                Integer curr = nodes.remove(0);
                if (groups.getOrDefault(curr, null) == null){
                    groups.put(curr, i);
                    int groupCount = groupsSize.getOrDefault(i, 0) + 1;
                    groupsSize.put(i, groupCount);
                    maxGroupSize = Math.max(maxGroupSize, groupCount);
                    for (int num : nums) {
                        if (curr != num && groups.getOrDefault(num, null) == null) {
                            int max = Math.max(curr, num);
                            int min = Math.min(curr, num);
                            if (Gcd(max, min) > 1) {
                                nodes.add(num);
                            }
                        }
                    }
                }
            }
        }
        return maxGroupSize;
    }

    private int Gcd(int a, int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
