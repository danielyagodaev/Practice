package problems.merge_k_sorted_lists;

import data_structers.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0){
            return null;
        }
        ListNode res = null, curr = null;
        int k = lists.length;
        int[] allMins = new int[k];
        int count = 0;
        for (int i=0; i<k; i++){
            if (lists[i] != null){
                allMins[count++] = lists[i].getVal();
            }
        }
        Arrays.sort(allMins, 0, count);
        ArrayList<Integer> helper = new ArrayList<>();
        for (int i=0; i<count; i++){
            helper.add(allMins[i]);
        }
        while (!helper.isEmpty()){
            int currMin = helper.remove(0);
            if (res == null){
                res = new ListNode(currMin);
                curr = res;
            }
            else{
                curr.setNext(new ListNode(currMin));
                curr = curr.getNext();
            }
            int nextMinIndex = getIndexOfListOfNextMin(lists, currMin);
            if (nextMinIndex != -1){
                insertNextMinSorted(helper, lists[nextMinIndex].getVal());
            }
        }
        return res;

    }

    public int getIndexOfListOfNextMin(ListNode[] lists, int currMin){
        for (int i=0; i<lists.length; i++){
            if (lists[i] != null && lists[i].getVal() == currMin){
                lists[i] = lists[i].getNext();
                if (lists[i] == null){
                    return -1;
                }
                else{
                    return i;
                }
            }
        }
        return -1;
    }

    public void insertNextMinSorted(List<Integer> currMins, int newMin){
        int start = 0, end = currMins.size();
        while (start < end){
            int mid = (int) ((start + end) / 2);
            int curr = currMins.get(mid);
            if (curr == newMin){
                start = mid;
                break;
            }
            else if (curr < newMin){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        currMins.add(start, newMin);
    }
}
