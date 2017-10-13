package linkedlist;

public class Copy {
    public RandomListNode copyRandomList(RandomListNode head) {
        if( head == null){
        	return null;
        }
        copyNext(head);
        copyRandom(head);
        return splitList(head);
    }
    
    public void copyNext( RandomListNode head){
    	while( head != null){
    		RandomListNode temp = head.next;
    		head.next = new RandomListNode(head.label);
    		head.next.random = head.random;
    		head.next.next = temp;
    		head = temp;
    	}
    }
    
    public void copyRandom( RandomListNode head){
    	while( head != null){
    		if(head.random != null){
    			head.next.random = head.random.next;
    		}
			head = head.next.next;
    	}
    }
    
    public RandomListNode splitList( RandomListNode head){
    	RandomListNode newHead = head.next;
    	while( head != null){
    		RandomListNode temp = head.next;
    		head.next = temp.next;
    		if(temp.next != null){
    			temp.next = temp.next.next;
    		}
    		head = head.next;
  		
    	}
    	return newHead;
    }
    
   /* private RandomListNode splitList(RandomListNode head) {
        RandomListNode newHead = head.next;
        while (head != null) {
            RandomListNode temp = head.next;
            head.next = temp.next;
            head = head.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
        return newHead;
    }*/


}
