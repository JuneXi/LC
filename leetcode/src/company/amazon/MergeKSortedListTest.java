package company.amazon;

public class MergeKSortedListTest {

	public static void main(String[] args) {
		MergeKSortedList mk = new MergeKSortedList();
		ArrayToListNode a2l = new ArrayToListNode();
		
		int[] l1 = {-10, -9, -9, -3, -1, -1,0};
		int[] l2 = {-5};
		int[] l3 = {4};
		int[] l4 = {-8};
		int[] l5;
		int[] l6 = {-9,-6,-5,-4,-2,2,3};
		int[] l7 = {-3,-3,-2,-1,0};
		
		ListNode[] lists = new ListNode[7];
		lists[0] = a2l.array2list(l1);
		lists[1] = a2l.array2list(l2);
		lists[2] = a2l.array2list(l3);
		lists[3] = a2l.array2list(l4);
		lists[5] = a2l.array2list(l6);
		lists[6] = a2l.array2list(l7);

		ListNode res = mk.mergeKLists(lists);
		while(res != null){
			System.out.print(res.val);
			res = res.next;
		}
	}

}
