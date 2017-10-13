package binaryTree;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		TreeNode root = new TreeNode(-3);
		MaxSum ms = new MaxSum();
		int res = ms.maxPathSum(root);
		System.out.print(res);*/
		
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		
		ValidateBST val = new ValidateBST();
		boolean res = val.isValidBST(root);
		System.out.print(res);

	}

}
