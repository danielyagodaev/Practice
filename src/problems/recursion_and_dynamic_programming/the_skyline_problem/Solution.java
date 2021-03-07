package problems.recursion_and_dynamic_programming.the_skyline_problem;

import java.util.*;

public class Solution {

    public List<List<Integer>> getSkyline(int[][] buildings){
        List<List<Integer>> helper = new ArrayList<>();
        for (int[] currBuilding : buildings){
            Integer[] currBuildingArr = {currBuilding[0], currBuilding[1], currBuilding[2]};
            List<Integer> currBuildingLst = Arrays.asList(currBuildingArr);
            int i = 0;
            boolean shouldAdd = true;
            while (i < helper.size()){
                List<Integer> prevBuilding = helper.get(i);
                if (buildingContainsBuilding(prevBuilding, currBuildingLst)){
                    // There is already a building which contains the current building, don't add it
                    shouldAdd = false;
                    break;
                }
                else if (buildingContainsBuilding(currBuildingLst, prevBuilding)){
                    // The current building contains one of the existing buildings, remove it
                    helper.remove(i);
                    continue;
                }
                else if (currBuildingLst.get(2).equals(prevBuilding.get(2))
                        && currBuildingLst.get(0) <= prevBuilding.get(1)){
                    // If there are two overlapping building with the same height, merge them
                    currBuildingLst.set(0, Math.min(currBuildingLst.get(0), prevBuilding.get(0)));
                    currBuildingLst.set(1, Math.max(currBuildingLst.get(1), prevBuilding.get(1)));
                    helper.remove(i);
                    continue;
                }
                i++;
            }
            if (shouldAdd){
                helper.add(currBuildingLst);
            }
        }
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
            // Use TreeMap(maxHeights) to hold the current highest building
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

    private boolean buildingContainsBuilding(List<Integer> building1, List<Integer> building2){
        return (building1.get(0) <= building2.get(0) && building1.get(1) >= building2.get(1) &&
                building1.get(2) >= building2.get(2));
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
