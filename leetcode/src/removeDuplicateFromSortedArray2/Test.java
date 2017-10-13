package removeDuplicateFromSortedArray2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] nums = new int[] {1,1,1,2,2,3};
		int res = sol.removeDuplicates(nums);
		for(int i = 0; i<res;i++){
			System.out.print(nums[i]);
		}

	}

}
