package linkedlist;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
    	if(head == null || head.next == null){
    		return true;
    	}
    	ListNode middle = findMiddle(head);
    	middle = reverse(middle);
    	while(middle != null && head != null){
    		if(middle.val != head.val){
    			return false;
    		}
    		middle = middle.next;
    		head = head.next;
    	}
    	return true;       
    }
    
    private ListNode findMiddle(ListNode head){
    	ListNode slow = head;
    	ListNode fast = head.next;
    	while(fast != null && fast.next != null){
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow.next;
    }
    
    private ListNode reverse(ListNode head){
    	ListNode pre = null;
    	while(head != null){
    		ListNode temp = head.next;
    		head.next = pre;
    		pre = head;
    		head = temp;
    	}
    	return pre;
    }
}
