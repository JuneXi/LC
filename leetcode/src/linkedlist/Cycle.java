package linkedlist;

public class Cycle {
    public boolean hasCycle(ListNode head) {
        if( head == null){
        	return false;
        }
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
        	slow = slow.next;
        	fast = fast.next;
        	if(fast == slow){
        		return true;
        	}
        }
        return false;

    }

}
