package KataProblems.week4.MaxSum;

public class MaxSum {

    static int maxSum(TreeNode root) {
        if (root==null){return 0;}
        return getMaximumPathOfChild(root);
    }

    static int getMaximumPathOfChild(TreeNode node){
        // if 'child' of leaf node, base case is null;
        if (node==null){
            return 0;
        }
        // get max of child paths
        int leftPathMax = getMaximumPathOfChild(node.left);
        int rightPathMax = getMaximumPathOfChild(node.right);

        // maximum path from the node in question
        return node.value + Math.max(leftPathMax, rightPathMax);
    }
}