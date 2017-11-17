package company.microsoft;

public class PopulatingNextRightPointersinEachNode2 {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        
        TreeLinkNode parent = root;
        TreeLinkNode cur;
        TreeLinkNode levelhead;
        while(parent != null){
            cur = null;
            levelhead = null;
            while(parent != null){
                if(parent.left != null){
                    if(levelhead == null){
                        levelhead = parent.left;
                        cur = levelhead;
                    }else{
                        cur.next = parent.left;
                        cur = cur.next;
                    }
                }
                if(parent.right != null){
                    if(levelhead == null){
                        levelhead = parent.right;
                        cur = levelhead;
                    }else{
                        cur.next = parent.right;
                        cur = cur.next;
                    }
                }
                parent = parent.next;
                
            }
            parent = levelhead;
        }
        
    }
	

}
