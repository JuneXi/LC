package binaryTree;

public class MaxSum {
	private class Result{
		int singlePath;
		int sum;
		Result(int singlePath,int sum){
			this.singlePath = singlePath;
			this.sum = sum;
		}
	}
	
public int maxPathSum(TreeNode root) {
	return helper(root).sum;
        
    }
public Result helper( TreeNode root){
	if( root == null){
		//notice !!!!
		return new Result(0,Integer.MIN_VALUE);
	}
	Result left = helper(root.left);
	Result right = helper(root.right);
	int sum = Math.max(left.sum, right.sum);
	int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
	// notice!!!!!! Must compare with 0 !!!
	singlePath = Math.max(singlePath, 0);
	Result res = new Result(singlePath,Math.max(left.singlePath + right.singlePath + root.val, sum));
	return res;
}


}
