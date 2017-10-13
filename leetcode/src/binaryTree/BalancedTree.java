package binaryTree;

public class BalancedTree {
    public boolean isBalanced(TreeNode root) {	
    	//int res = balanceHelper(root, 0);
    	//return res>0;
    	return balanceHelper(root, 0)!= -1;
        
    }
    
    public int balanceHelper( TreeNode root, int depth){
    	
    	if(root == null){
    		return depth;
    	}
    	int left = balanceHelper(root.left, depth);
    	int right = balanceHelper(root.right, depth);
    	
    	// what about exchange the if condition order below?
    	if((Math.abs(left - right) < 2) && left != -1 && right != -1 ){
    		return Math.max(left, right) + 1;
    	}
    	else{
    		return -1;
    	}
    	
    }

}
