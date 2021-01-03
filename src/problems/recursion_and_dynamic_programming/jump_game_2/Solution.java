package problems.recursion_and_dynamic_programming.jump_game_2;

import java.util.ArrayDeque;

public class Solution {

    public static int jump(int[] nums){
        int n = nums.length;
        int[] minJumps = new int[n];
        for (int i=1; i<n; i++){
            minJumps[i] = Integer.MAX_VALUE;
        }
        minJumps[0] = 0;
        ArrayDeque<Integer> nodes = new ArrayDeque<>();
        nodes.add(0);
        while(minJumps[n-1] == Integer.MAX_VALUE && !nodes.isEmpty()){
            int currIndex = nodes.poll();
            for (int i=1; currIndex+i < n && i<=nums[currIndex]; i++){
                if (minJumps[currIndex+i] == Integer.MAX_VALUE){
                    minJumps[currIndex+i] = minJumps[currIndex] + 1;
                    nodes.add(currIndex+i);
                }
            }
        }
        return minJumps[n-1];
    }
}
