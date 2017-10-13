package binaryTree;

public class Depth {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null){
        	return depth;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

}
