package linkedlist;

public class OddEven {
    public ListNode oddEvenList(ListNode head) {
    	if( head == null){
    		return head;
    	}
    	ListNode evenhead = head.next;
    	ListNode even = evenhead;
    	ListNode dummy = head;
    	dummy.next = head;
    	while(head.next != null && head.next.next != null){
    		head.next = even.next;
    		head = head.next;
    		even.next = head.next;
    		even = even.next;
    	}
    	head.next = evenhead;
    	return dummy;
        
    }
}
