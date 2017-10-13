package binaryTree;

public class ValidateBST {
	
private class Result {
	int max;
	int min;
	boolean isValid;
	
	Result(int max, int min, boolean isValid){
		this.max = max;
		this.max = min;
		this.isValid = isValid;
	}
}

public boolean isValidBST(TreeNode root) {
	
	return validHelper(root).isValid;
        
    }

public Result validHelper(TreeNode root){
	
	if( root == null){
		return new Result(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
	}
	Result left = validHelper(root.left);
	Result right = validHelper(root.right);
	
	if(!left.isValid || !right.isValid ){
		return new Result(0, 0, false);
	}
		
	if((root.left!=null && left.max >= root.val) || (root.right != null && right.min <= root.val)){
		return new Result(0, 0, false);
	}
	return new Result(Math.max(root.val,right.max), Math.min(left.min, root.val), true);
	
}

}
