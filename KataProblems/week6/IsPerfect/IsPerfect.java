package KataProblems.week6.IsPerfect;

import java.util.HashSet;
import java.util.Set;

public class IsPerfect {
    TreeNode left;
    TreeNode right;
    static Set<Integer> depthCheck = new HashSet<Integer>();

    public static boolean isPerfect(TreeNode root) {
        depthCheck.clear();
        if (root==null){return true;}
        traversePaths(root,0);
        return depthCheck.size()<=1;
    }

    public static void traversePaths(TreeNode node, int height){
        height++;
        if (node.left!=null && node.right!=null){
            traversePaths(node.left, height);
            traversePaths(node.right, height);
        } else if (node.left!=null){
            depthCheck.add(height);
            traversePaths(node.left, height);
        } else if (node.right!=null){
            depthCheck.add(height);
            traversePaths(node.right, height);
        } else if (node.left==null && node.right==null){
            depthCheck.add(height);
        }
    }

//    static TreeNode leaf() {
//        return new TreeNode();
//    }
//
//    static TreeNode join(TreeNode left, TreeNode right) {
//        return new TreeNode().withChildren(left, right);
//    }
//
//    TreeNode withLeft(TreeNode left) {
//        this.left = left;
//        return this;
//    }
//
//    TreeNode withRight(TreeNode right) {
//        this.right = right;
//        return this;
//    }
//
//    TreeNode withChildren(TreeNode left, TreeNode right) {
//        this.left = left;
//        this.right = right;
//        return this;
//    }
//
//    TreeNode withLeftLeaf() {
//        return withLeft(leaf());
//    }
//
//    TreeNode withRightLeaf() {
//        return withRight(leaf());
//    }
//
//    TreeNode withLeaves() {
//        return withChildren(leaf(), leaf());
//    }
}
