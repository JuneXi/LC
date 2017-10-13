package company.amazon;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	StringBuilder sb = new StringBuilder();
    	return buildString(root, sb);

    }
    private String buildString(TreeNode root, StringBuilder sb){
    	if(root == null){
    		sb.append('A').append(',');
    	}else{
    	sb.append(root.val).append(',');
    	buildString(root.left, sb);
    	buildString(root.right, sb);
    	}

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	if(data == null || data.length() == 0){
    		return null;
    	}
    	Deque<String> dq = new LinkedList<String>();
    	dq.addAll(Arrays.asList(data.split(",")));
    	return buildTree(dq);	
        
    }
    
    private TreeNode buildTree(Deque<String> dq){
    	String val = dq.remove();
    	if(val.equals("A")){
    		return null;
    	}
    	//TODO: string to int
    	TreeNode node = new TreeNode(Integer.valueOf(val));
    	node.left = buildTree(dq);
    	node.right = buildTree(dq);
    	return node;
    }
    
    //TODO:notice 
/*    private TreeNode buildTree(String data){
    	//data won't change after return....primitive???
    	char val = data.charAt(0);
    	data = data.substring(1);
    	if(data == null || data.length() == 0 || val == 'A'){
    		return null;
    	}
    	TreeNode node = new TreeNode(val - '0');
    	System.out.print(node.val);
    	node.left = buildTree(data);
    	node.right = buildTree(data);
    	return node;
    }*/

}
