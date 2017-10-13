package company.amazon;

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists == null || lists.length == 0){
    		return null;
    	}
        if(lists.length == 1){
        	return lists[0];
        }
        int interval = 1;
        while(interval < lists.length){
        	//what is the condition???
        	for(int i = 0; i < lists.length - interval;i = i + interval * 2){
        		lists[i] = merge2list(lists[i], lists[i + interval]);       	
        	}
        	interval = interval * 2;
        }
        return lists[0];
    }
    
    private ListNode merge2list(ListNode l1, ListNode l2){
    	if(l1 == null){
    		return l2;
    	}
    	if(l2 == null){
    		return l1;
    	}
    	ListNode head;
    	if(l1.val < l2.val){
    		head = l1;
    		head.next = merge2list(l1.next, l2);
    	}else{
    		head = l2;
    		head.next = merge2list(l1, l2.next);
    	}
    	return head;
    }

}
