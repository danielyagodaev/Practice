package problems.data_structers.linked_lists.merge_k_sorted_lists;

import data_structers.ListNode;

import java.util.*;

public class Solution {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0){
            return null;
        }
        ListNode res = null, curr = null;
        int k = lists.length;
        TreeMap<Integer, List<Integer>> allMinsWithIndexes = new TreeMap<>();
        for (int i=0; i<k; i++){
            if (lists[i] != null){
                int val = lists[i].getVal();
                insertIntoTreeMap(val, i, allMinsWithIndexes);
            }
        }
        while (!allMinsWithIndexes.isEmpty()){
            Map.Entry<Integer, List<Integer>> currMin = allMinsWithIndexes.firstEntry();
            ListNode temp = new ListNode(currMin.getKey());
            if (res == null){
                res = temp;
            }
            else{
                curr.setNext(temp);
            }
            curr = temp;
            List<Integer> indexes = currMin.getValue();
            int currIndex = indexes.remove(0);
            if (indexes.isEmpty()){
                allMinsWithIndexes.pollFirstEntry();
            }
            lists[currIndex] = lists[currIndex].getNext();
            if (lists[currIndex] != null){
                insertIntoTreeMap(lists[currIndex].getVal(), currIndex, allMinsWithIndexes);
            }
        }
        return res;
    }

    private static void insertIntoTreeMap(int val, int index, TreeMap<Integer, List<Integer>> map){
        List<Integer> indexes;
        if (map.containsKey(val)){
            indexes = map.get(val);
        }
        else{
            indexes = new ArrayList<>();
            map.put(val, indexes);
        }
        indexes.add(index);
    }
}
