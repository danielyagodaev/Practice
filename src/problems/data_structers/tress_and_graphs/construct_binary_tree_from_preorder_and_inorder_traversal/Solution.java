package problems.data_structers.tress_and_graphs.construct_binary_tree_from_preorder_and_inorder_traversal;

import data_structers.TreeNode;

import java.util.HashMap;

public class Solution {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> indexes = new HashMap<>();
        return buildTreeRec(preorder, inorder, 0, preorder.length, indexes);
    }

    private static TreeNode buildTreeRec(int[] preorder, int[] inorder, int start, int end,
                                 HashMap<Integer, Integer> indexes){
        TreeNode curr = null;
        if (start < end){
            curr = new TreeNode(preorder[start]);
            if (start+1 < end){
                int j=start+1;
                int currIndex = getIndexOf(curr.getVal(), inorder, indexes);
                while (j<end && (currIndex > getIndexOf(preorder[j], inorder, indexes))){
                    j++;
                }
                if (j == start+1){
                    curr.setLeft(null);
                }
                else{
                    TreeNode left = buildTreeRec(preorder, inorder, start+1, j, indexes);
                    curr.setLeft(left);
                }
                TreeNode right = buildTreeRec(preorder, inorder, j, end, indexes);
                curr.setRight(right);
            }

        }
        return curr;
    }

    private static int getIndexOf(int val, int[] arr, HashMap<Integer, Integer> indexes){
        if (indexes.containsKey(val)){
            return indexes.get(val);
        }
        int i = 0;
        while (i < arr.length && arr[i] != val){
            i++;
        }
        indexes.put(val, i);
        return i;
    }
}
