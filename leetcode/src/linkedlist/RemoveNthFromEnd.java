package linkedlist;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
        	return null;
        }
        ListNode fast = new ListNode(0);
        fast.next = head;
        ListNode slow = fast;
        head = fast;
        for(int i = 0; i < n; i++){
        	fast = fast.next;
        }
        while(fast.next != null){
        	fast = fast.next;
        	slow = slow.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }

}
