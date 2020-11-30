package KataProblems.week4.ArrayToTree;

public class ArrayToTree {
    static TreeNode arrayToTree(int[] array) {
        if (array.length==0){return null;}
        return createChildTreeNode(array, 0);
    }

    static TreeNode createChildTreeNode(int[] array, int idx){
        TreeNode leftNode  = (idx*2+1<array.length) ? createChildTreeNode(array, idx*2+1) : null;
        TreeNode rightNode = (idx*2+2<array.length) ? createChildTreeNode(array, idx*2+2) : null;
        return new TreeNode(array[idx], leftNode, rightNode);
    }
}
