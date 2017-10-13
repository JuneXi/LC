package linkedlist;

public class Reorder {
    public void reorderList(ListNode head) {
        if(head != null && head.next != null){
        	ListNode mid = findMiddle(head);
        	ListNode right = reverse(mid.next);
        	mid.next = null;
        	merge(head, right);
        }
    }
    
    public ListNode findMiddle(ListNode head){
    	ListNode slow = head;
    	ListNode fast = head.next;
    	while(fast != null && fast.next != null){
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow;
    	
    }
    
    public ListNode reverse(ListNode head){
    	ListNode pre = null;   	
    	while(head !=null){
    		ListNode temp = head.next;
    		head.next = pre;
    		pre = head;
    		head = temp;
    	}
    	
    	return pre;
    }
    //new a new list
    public void merge(ListNode left, ListNode right){
    	int i = 0;
    	ListNode dummy = new ListNode(0);
    	while(left != null && right != null){
    		if(i%2 == 0){
    			dummy.next = left;
    			left = left.next;
    		}
    		else{
    			dummy.next = right;
    			right = right.next;
    		}
    		dummy = dummy.next;
    		i++;
    	}
    	if(left != null){
    		dummy.next = left;
    	}
    	else{
    		dummy.next = right;
    	}
    }

}
