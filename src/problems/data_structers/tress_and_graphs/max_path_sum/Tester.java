package problems.data_structers.tress_and_graphs.max_path_sum;

import data_structers.TreeNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1, n2, n3);
        assertEquals(6, Solution.maxPathSum(n1), 6);
    }

    @Test
    public void test2(){
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        TreeNode n3 = new TreeNode(20, n4, n5);
        TreeNode n2 = new TreeNode(9);
        TreeNode n1 = new TreeNode(-10, n2, n3);
        assertEquals(42, Solution.maxPathSum(n1));
    }

}
