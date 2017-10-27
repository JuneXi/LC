package company.google;

public class BinaryTreePathsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreePaths app = new BinaryTreePaths();
		
		//tree
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		
		app.binaryTreePaths(root);

	}

}
