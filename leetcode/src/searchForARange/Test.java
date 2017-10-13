package searchForARange;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] nums = new int[] {5,7,7,8,8,10};
//		int[] nums = new int[] {1};
		int target = 8;
		int[] res = sol.searchRange(nums, target);
		System.out.println(res[0]);
		System.out.println(res[1]);

	}

}
