package linkedlist;

public class Reverse {
    public ListNode reverseList(ListNode head) {
    	if(head == null){
    		return head;
    	}
    	ListNode pre = null;
        
    	while(head.next != null){
    		ListNode temp = head.next;
    		head.next = pre;
    		pre = head;
    		head = temp;   		
    	}
    	//Last step
    	head.next = pre;
    	return head;
    }

}
