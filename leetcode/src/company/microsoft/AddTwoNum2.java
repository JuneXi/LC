package company.microsoft;

import java.util.Stack;

public class AddTwoNum2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null){
        	s1.push(l1.val);
        	l1 = l1.next;
        }
        
        while(l2 != null){
        	s2.push(l2.val);
        	l2 = l2.next;
        }
        int sum = s1.pop() + s2.pop();
        ListNode node = new ListNode(sum % 10);
        sum = sum / 10;
        while(!s1.isEmpty() || !s2.isEmpty()){
        	//not != null
        	if(!s1.isEmpty()){
        		sum += s1.pop();
        	}
        	if(!s2.isEmpty()){
        		sum += s2.pop();
        	}
            ListNode head = new ListNode(sum % 10);
        	head.next = node;
        	sum = sum / 10;
        	node = head;       	
        }
        //note: check sum
           if(sum > 0){
               ListNode head = new ListNode(1);
               head.next = node;
               node = head;
           }
        
        return node;
        
    }

}
