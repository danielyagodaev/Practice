package problems.remove_nth_node_from_end_of_list;

import data_structers.ListNode;

public class Solution {

    /**
     * Assumptions:
     * The number of nodes in the list is sz.
     * 1 <= sz <= 30
     * 0 <= Node.val <= 100
     * 1 <= n <= sz
     * Need to do it in one pass
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode[] allNodes = new ListNode[30];
        for (int i=0; i<allNodes.length; i++){
            allNodes[i] = null;
        }
        int counter = 0;
        ListNode curr = head;
        while (curr != null){
            allNodes[counter++] = new ListNode(counter, curr);
            curr = curr.getNext();
        }
        if (counter == 1){
            // Only one node in the list
            return null;
        }
        if (n == 1){
            // Remove last link
            ListNode beforeLast = allNodes[counter-2].getNext();
            beforeLast.setNext(null);
        }
        else if (n == counter){
            // Remove first link
            head = allNodes[1].getNext();
        }
        else{
            // Remove link somewhere in the middle of the list
            ListNode oneBefore = allNodes[counter-1-n].getNext();
            ListNode oneAfter = allNodes[counter-1-n+2].getNext();
            oneBefore.setNext(oneAfter);
        }
        return head;
    }
}
