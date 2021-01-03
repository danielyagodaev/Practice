package problems.data_structers.tress_and_graphs.max_path_sum;

import data_structers.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static int maxPathSum(TreeNode root) {
        HashMap<TreeNode, Integer> cache = new HashMap<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        int res = Integer.MIN_VALUE;
        if (root != null){
            queue.add(root);
            while (!queue.isEmpty()){
                TreeNode curr = queue.remove(0);
                res = Math.max(res, calcMaxPathSumRec(curr, cache, false));
                if (curr.getLeft() != null){
                    queue.add(curr.getLeft());
                }
                if (curr.getRight() != null){
                    queue.add(curr.getRight());
                }
            }
        }
        return res;
    }

    private static int calcMaxPathSumRec(TreeNode temp, HashMap<TreeNode, Integer> cache, boolean withPrev){
        if (withPrev && cache.containsKey(temp)){
            return cache.get(temp);
        };
        int leftScore = 0, rightScore = 0;
        if (temp.getLeft() != null){
            leftScore = calcMaxPathSumRec(temp.getLeft(), cache, true);
        }
        if (temp.getRight() != null){
            rightScore = calcMaxPathSumRec(temp.getRight(), cache, true);
        }
        int rootScore = calcBestScore(temp.getVal(), leftScore, rightScore, withPrev);
        if (withPrev){
            cache.put(temp, rootScore);
        }
        return rootScore;
    }

    private static int calcBestScore(int rootVal, int leftScore, int rightScore, boolean withPrev){
        int res = rootVal;
        if (!withPrev){
            if (leftScore > 0){
                res += leftScore;
            }
            if (rightScore > 0){
                res += rightScore;
            }
        }
        else{
            int bestChild = Math.max(leftScore, rightScore);
            int maxChildScore = Math.max(bestChild, 0);
            res += maxChildScore;
        }
        return res;
    }
}
