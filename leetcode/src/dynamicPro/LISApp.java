package dynamicPro;

public class LISApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LIS lis = new LIS();
		int[] nums = {10,9,2,5,3,7,101,18};
		int res = lis.lengthOfLIS(nums);
		System.out.print(res);
	}

}
