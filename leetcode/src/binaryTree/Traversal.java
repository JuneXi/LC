package binaryTree;

import java.util.ArrayList;
import java.util.List;


public class Traversal {
	// using traverse
    public List<Integer> inorderTraversal(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<>();
        traverse(root,res);
        return res;
    }
    public void traverse(TreeNode root, ArrayList<Integer> res){
    	if(root == null){
    		return;
    	}
    	traverse(root.left, res);
    	res.add(root.val);
    	traverse(root.right, res);
    	
    }
	

}
