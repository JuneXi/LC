package linkedlist;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null){
    		return head;
    	}
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	head = dummy;
    	while(head.next != null && head.next.next != null){
    		ListNode tem = head.next.next;
    		head.next.next = tem.next;
    		tem.next = head.next;
    		head.next = tem;
    		head = tem.next;
    	}
    	return dummy.next;
        
    }

}
