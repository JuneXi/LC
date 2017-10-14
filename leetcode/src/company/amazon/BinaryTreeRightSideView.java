package company.amazon;

import java.util.ArrayList;
import java.util.List;

/*Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].

Credits:
Special thanks to @amrsaqr for adding this problem and creating all test cases.*/

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	if(root == null){
    		return res;
    	}
    	
    	return helper(root, 0,res);
        
    }
    
    private ArrayList<Integer> helper(TreeNode node, int depth, ArrayList<Integer> res){
    	if(node == null){
    		return null;
    	}
    	if(depth > res.size()){
    		res.add(node.val);
    	}
    	//TODO: why can't use ++, why must depth + 1
    	helper(node.right, depth + 1,res);
    	helper(node.left, depth + 1,res);
    	return res;
    	
    }

}
