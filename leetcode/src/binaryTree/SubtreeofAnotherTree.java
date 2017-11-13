package binaryTree;

public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return s!= null && (helper(s,t) || isSubtree(s.right, t) || isSubtree(s.left, t));       
        
    }
    
    
    private boolean helper(TreeNode s, TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        return (s.val == t.val) && helper(s.right, t.right) && helper(s.left, t.left); 
    }

}
