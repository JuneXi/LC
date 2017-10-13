package linkedlist;

public class ToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
        	return null;
        }
        if(head.next == null ){
        	return new TreeNode(head.val);
        }
        ListNode middle = findMiddle(head);
        TreeNode root = new TreeNode(middle.next.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middle.next);
        return root;
    }
    
    private ListNode findMiddle(ListNode head){
    	ListNode slow = head;
    	ListNode fast = head.next;
    	while(fast != null && fast.next != null){
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow;
    }
    

}
