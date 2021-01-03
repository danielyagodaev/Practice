package problems.data_structers.linked_lists.rotate_list;

import data_structers.ListNode;

public class Solution {

    /**
     * Given the head of a linked list, rotate the list to the right by k places.
     * Constraints:
     * The number of nodes in the list is in the range [0, 500].
     * -100 <= Node.val <= 100
     * 0 <= k <= 2 * 109
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        final int MAX_NODES_COUNT = 500;
        ListNode[] allNodes = new ListNode[MAX_NODES_COUNT];
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            allNodes[count++] = temp;
            temp = temp.getNext();
        }
        int fixedRotation = k % count;
        if (fixedRotation > 0) {
            int newHeadIndex = count - fixedRotation;
            ListNode newHead = allNodes[newHeadIndex];
            ListNode newTail = allNodes[newHeadIndex - 1];
            newTail.setNext(null);
            ListNode tail = allNodes[count - 1];
            tail.setNext(head);
            return newHead;
        } else {
            return head;
        }
    }
}
