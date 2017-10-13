package linkedlist;

public class Partition {
    public ListNode partition(ListNode head, int x) {
        if(head == null){
        	return null;
        }
        ListNode largedummy = new ListNode(0);
        ListNode dummy = new ListNode(0);
        ListNode left = dummy, right = largedummy;
        //why not head.next !=null
        while(head != null){
        	if(head.val <x){
        		left.next = head;
        		//left = left.next; use head to make it faster
        		left = head;
        	}
        	else{
        		right.next = head;
        		right = right.next;
        	}
        	head = head.next;
        }
        right.next = null;
        left.next = largedummy.next;
        return dummy.next;
    }
}
