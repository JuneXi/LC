package company.microsoft;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        //note: here
        if(root == null){
            return;
        }
        Queue<TreeLinkNode> q = new LinkedList<>();
        q.add(root);
        int size = 1;
        while(!q.isEmpty()){
            for(int i = 1; i < size; i++){
                TreeLinkNode cur = q.poll();
                cur.next = q.peek();
                if(cur.left != null){
                    q.add(cur.left);
                    q.add(cur.right);
                }
            }
            
        TreeLinkNode last = q.poll();
        if(last.left != null){
        	q.add(last.left);
        	q.add(last.right);
        	size = q.size();
        }
        }
            
    }

}
