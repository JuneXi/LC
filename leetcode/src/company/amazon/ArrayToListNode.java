package company.amazon;

public class ArrayToListNode {
	public ListNode array2list(int[] array){
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		for(int i = 0; i < array.length; i++){
			head.next = new ListNode(array[i]);
			head = head.next;
		}
		return dummy.next;
	}

}
