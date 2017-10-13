package linkedlist;

public class Sort {
    public ListNode sortList(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}
    	ListNode middle = findMiddle(head);
    	ListNode right = sortList(middle.next);
    	middle.next = null;
    	ListNode left = sortList(head);
    	return merge(left, right);
    	
        
    }
    public ListNode merge(ListNode left, ListNode right){
    	if(left == null){
    		return right;
    	}
    	if(right == null){
    		return left;
    	}
    	ListNode head;
    	if(left.val < right.val){
    		head = left;
    		head.next = merge(left.next, right);
    	}
    	else{
    		head = right;
    		head.next = merge(left, right.next);
    	}
    	return head;

    }
    public ListNode findMiddle(ListNode head){
    	ListNode slow = head;
    	ListNode fast = head.next;
    	while(fast != null && fast.next != null){
    		slow = slow.next;
    		fast= fast.next.next;
    	}
    	return slow;
    	
    }

}
