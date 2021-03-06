package problems.recursion_and_dynamic_programming.the_skyline_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> getSkyline(int[][] buildings){
        if (buildings.length == 1){
            List<List<Integer>> res = new ArrayList<>();
            Integer[][] buildingData = {{buildings[0][0], buildings[0][2]}, {buildings[0][1], 0}};
            for (Integer[] building : buildingData){
                res.add(Arrays.asList(building));
            }
            return res;
        }
        else{
            return mergeSkylines(getSkyline(splitL(buildings)), getSkyline(splitR(buildings)));
        }
    }

    private int[][] splitL(int[][] buildings){
        int mid = buildings.length / 2;
        int[][] res = new int[mid][3];
        for (int i=0; i<mid; i++){
            res[i] = Arrays.copyOf(buildings[i], 3);
        }
        return res;
    }

    private int[][] splitR(int[][] buildings){
        int mid = buildings.length / 2;
        int[][] res = new int[buildings.length-mid][3];
        for (int i=0; i<res.length; i++){
            res[i] = Arrays.copyOf(buildings[mid+i], 3);
        }
        return res;
    }

    private List<List<Integer>> mergeSkylines(List<List<Integer>> leftPart, List<List<Integer>> rightPart){
        List<List<Integer>> res = new ArrayList<>();
        int n = leftPart.size(), m = rightPart.size();
        int i = 0, j = 0;
        int h1 = 0, h2 = 0;
        List<Integer> leftStrip, rightStrip;
        while (i < n && j < m){
            leftStrip = leftPart.get(i);
            rightStrip = rightPart.get(j);
            if (leftStrip.get(0) < rightStrip.get(0)){
                h1 = leftStrip.get(1);
                leftStrip.set(1, Math.max(h1, h2));
                addStrip(res, leftStrip);
                i++;
            }
            else{
                h2 = rightStrip.get(1);
                rightStrip.set(1, Math.max(h1, h2));
                addStrip(res, rightStrip);
                j++;
            }
        }
        while (i < n){
            addStrip(res, leftPart.get(i));
            i++;
        }
        while (j < m){
            addStrip(res, rightPart.get(j));
            j++;
        }
        return res;
    }

    private void addStrip(List<List<Integer>> res, List<Integer> strip){
        int n = res.size();
        if (n > 0 && res.get(n-1).get(1).equals(strip.get(1))){
            // same height, don't add it
            return;
        }
        else if (n > 0 && res.get(n-1).get(0).equals(strip.get(0))){
            // same index
            res.get(n-1).set(1, Math.max(res.get(n-1).get(1), strip.get(1)));
            return;
        }
        res.add(strip);
    }

    public static void printSkyline(List<List<Integer>> skyline){
        for (List<Integer> strip : skyline){
            System.out.printf("{%d, %d}\n", strip.get(0), strip.get(1));
        }
    }

    public static void main(String[] args){
        int[][] buildings = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        Solution s = new Solution();
        List<List<Integer>> skyline = s.getSkyline(buildings);
        printSkyline(skyline);
    }
}
