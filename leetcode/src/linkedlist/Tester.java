package linkedlist;

public class Tester {

	public static void main(String[] args) {
		
		/*		int n = 0;
		Partition app = new Partition();
		ListNode result = app.partition(node, n);
		System.out.print(result.val);*/
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		//node.next.next = new ListNode(2);
		//node.next.next.next = new ListNode(1);
		//Sort app = new Sort();
		//ListNode res = app.sortList(node);
/*		Reorder app = new Reorder();
		app.reorderList(node);
		System.out.print(node.val+ node.next.val);
		*/
		
		//IsPalindrome
		/*IsPalindrome app = new IsPalindrome();
		Boolean res = app.isPalindrome(node);
		System.out.print(res);*/
		
		//SwapPairs
		SwapPairs app = new SwapPairs();
		ListNode res = app.swapPairs(node);
		System.out.print(res.val+res.next.val);
	}

}
