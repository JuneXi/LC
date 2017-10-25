package company.google;

import java.util.ArrayList;
import java.util.List;

/*Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]*/

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
    	ArrayList<String> result = new ArrayList<String>();
    	if(root == null){
    		return result;
    	}
    	
    	helper(root, "", result);
    
        return result;
        
    }
    
    private void helper(TreeNode node, String path, ArrayList<String> res){
    	if(node.right == null && node.left == null){
    		res.add(path + node.val);
    		return;
    	}  	
    	if(node.left != null){
    		//note: here, because we don't want to change the path value, so use path + ""
    		//then, when method go back to the up level, path hasn't been changed
    		helper(node.left, path + node.val + "->", res);
    	} 
    	if(node.right != null){
    		helper(node.right, path + node.val + "->", res);
    	}
    }
    
    

}
