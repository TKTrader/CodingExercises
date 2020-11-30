package KataProblems.week4.MaxSum;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MaxSumTest {
    /**
     * null
     */
    @Test
    public void maxSumInNullTree() {
        TreeNode root = null;
        assertThat(MaxSum.maxSum(root), is(0));
    }

    /**
     *      5
     *    /   \
     *  -22    11
     *  / \    / \
     * 9  50  9   2
     */
//    @Test
//    public void maxSumInPerfectTree() {
//        TreeNode left = TreeNode.leaf(-22).withLeaves(9, 50);
//        TreeNode right = TreeNode.leaf(11).withLeaves(9, 2);
//        TreeNode root = TreeNode.join(5, left, right);
//        assertThat(Solution.maxSum(root), is(33));
//    }
}
