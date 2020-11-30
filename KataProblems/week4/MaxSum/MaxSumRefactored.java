package KataProblems.week4.MaxSum;

public class MaxSumRefactored {
    static int maxSum(TreeNode root) {
        if (root==null){return 0;}
        return root.value + Math.max(maxSum(root.left), maxSum(root.right));
    }
}
