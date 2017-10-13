package binaryTree;

public class LowestCommonAncestor {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		return ancestorHelper(root, p, q);
	}
	
	public TreeNode ancestorHelper(TreeNode node, TreeNode q, TreeNode p){
		if(node == null || node == q || node == p){
			return node;
		}
		TreeNode left = ancestorHelper(node.left, q, p);
		TreeNode right = ancestorHelper(node.right, q, p);
		
		if(left != null && right != null){
			return node;
		}
		else if(left != null){
			return left;
		}
		else if(right != null){
			return right;
		}
		else{
			return null;
		}
	}

}
