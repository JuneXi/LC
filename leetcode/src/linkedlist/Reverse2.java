package linkedlist;

public class Reverse2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if( head == null){
    		return head;
    	}
    	int i = 1;
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode pre = dummy;
    	while(i < m){
    		pre = pre.next;
    	}
    	ListNode mNode = pre.next;
    	ListNode nNode = mNode;
    	head = mNode.next;
    	int j = m;	
    	while(j < n){
    		ListNode temp = head.next;
    		head.next = nNode;
    		nNode = head;
    		head = temp;		
    	}
    	mNode.next = head;
    	pre.next = nNode;
    	
    	return head;
    	
    }

}
