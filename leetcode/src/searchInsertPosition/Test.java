package searchInsertPosition;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] nums = new int[] {1,3};
//		int[] nums = new int[] {1};
		int target = 3;
		int res = sol.searchInsert(nums,target);
		System.out.println(res);


	}

}
