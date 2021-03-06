package problems.recursion_and_dynamic_programming.the_skyline_problem;

import java.util.*;

public class Solution {

    public List<List<Integer>> getSkyline(int[][] buildings){
        List<List<Integer>> helper = new ArrayList<>();
        for (int[] buildingData : buildings){
            List<Integer> lst = new ArrayList<>();
            for (int val : buildingData){
                lst.add(val);
            }
            helper.add(lst);
        }
        removeDuplicates(helper);
        mergeSameHeights(helper);
        List<BuildingIndex> buildingIndexes = new ArrayList<>();
        for (List<Integer> buildingData : helper){
            BuildingIndex start = new BuildingIndex(buildingData.get(0), buildingData.get(2), false);
            BuildingIndex end = new BuildingIndex(buildingData.get(1), buildingData.get(2), true);
            Collections.addAll(buildingIndexes, start, end);
        }
        Collections.sort(buildingIndexes);
        List<List<Integer>> res = new ArrayList<>();
        TreeMap<Integer, Integer> maxHeights = new TreeMap<>();
        for (BuildingIndex buildingIndex : buildingIndexes){
            if (buildingIndex._isEnd){
                int temp = maxHeights.remove(buildingIndex._height);
                if (temp > 1) {
                    maxHeights.put(buildingIndex._height, temp - 1);
                }
            }
            else{
                int count = maxHeights.getOrDefault(buildingIndex._height, 0);
                maxHeights.put(buildingIndex._height, count+1);
            }
            int currMaxHeight = maxHeights.isEmpty() ? 0 : maxHeights.lastKey();
            addStrip(res, buildingIndex._index, currMaxHeight);
        }
        return res;
    }

    private void removeDuplicates(List<List<Integer>> helper){
        int i = 1;
        while (i < helper.size()){
            List<Integer> curr = helper.get(i);
            List<Integer> prev = helper.get(i-1);
            if (buildingInsideBuilding(prev, curr) || buildingInsideBuilding(curr, prev)){
                // Same range
                prev.set(0, Math.min(prev.get(0), curr.get(0)));
                prev.set(1, Math.max(prev.get(1), curr.get(1)));
                prev.set(2, Math.max(prev.get(2), curr.get(2)));
                helper.remove(i);
            }
            else{
                i++;
            }
        }
    }

    private boolean buildingInsideBuilding(List<Integer> building1, List<Integer> building2){
        return (building1.get(0) <= building2.get(0) && building1.get(1) >= building2.get(1) &&
                building1.get(2) >= building2.get(2));
    }

    private void mergeSameHeights(List<List<Integer>> helper){
        int i = 1;
        while (i < helper.size()){
            List<Integer> curr = helper.get(i);
            List<Integer> prev = helper.get(i-1);
            if (curr.get(0) <= prev.get(1) && curr.get(2).equals(prev.get(2))){
                // Same height with interleaving ranges
                prev.set(1, Math.max(prev.get(1), curr.get(1)));
                helper.remove(i);
            }
            else{
                i++;
            }
        }
    }

    private void addStrip(List<List<Integer>> res, Integer index, Integer height){
        int n = res.size();
        if (n > 0 && res.get(n-1).get(1).equals(height)){
            // same height, don't add it
            return;
        }
        else if (n > 0 && res.get(n-1).get(0).equals(index)){
            // same index
            res.get(n-1).set(1, Math.max(res.get(n-1).get(1), height));
            return;
        }
        Integer[] newStrip = {index, height};
        res.add(Arrays.asList(newStrip));
    }

    static class BuildingIndex implements Comparable<BuildingIndex> {

        Integer _index;
        Integer _height;
        Boolean _isEnd;

        public BuildingIndex(int index, int height, boolean isEnd){
            this._index = index;
            this._height = height;
            this._isEnd = isEnd;
        }

        @Override
        public int compareTo(BuildingIndex o){
            return this._index.compareTo(o._index);
        }
    }

}
