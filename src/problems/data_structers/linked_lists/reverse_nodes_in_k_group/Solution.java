package problems.data_structers.linked_lists.reverse_nodes_in_k_group;

import data_structers.ListNode;

import java.util.Stack;

public class Solution {

    public static ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> headers = new Stack<>();
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            if (count % k == 0){
                // Push each group's header
                headers.push(temp);
            }
            temp = temp.getNext();
            count++;
        }
        ListNode lastHead = null;
        int size = headers.size();
        if (size > (count / k)){
            // Remove the last element in case we have insufficient elements
            headers.pop();
        }
        while (!headers.isEmpty()){
            ListNode curr = headers.pop(), next;
            ListNode prev;
            if (lastHead == null){
                prev = curr;
                for (int i=0; i<k; i++){
                    prev = prev.getNext();
                }
            }
            else{
                prev = lastHead;
            }
            for (int i=0; i<k; i++){
                next = curr.getNext();
                curr.setNext(prev);
                prev = curr;
                curr = next;
            }
            lastHead = prev;
        }
        return lastHead;
    }
}
