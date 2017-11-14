package company.microsoft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        
        //Queue<TreeNode> q = LinkedList<TreeNode>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int size = 1;
        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            //use size to determine when to change to next level
            for(int i = 0; i < size; i++){
            	//note: poll not posh
                TreeNode cur = q.poll();
                if(level == 0){
                    list.add(cur.val);
                }else{
                    list.add(0, cur.val);
                }
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
                
            }
            size = q.size();
            level = 1- level;
            res.add(new ArrayList(list));
        }
        return res;
        
    }

}
