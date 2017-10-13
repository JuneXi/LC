package dynamicPro;

public class TargetSumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TargetSum ts = new TargetSum();
		int[] nums = {1,2,3,1};
		int s = 1;
		int res = ts.findTargetSumWays(nums, s);
		System.out.print(res);

	}

}
