package dynamicPro;

public class JumpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGame jum = new JumpGame();
		int[] nums = {3,2,1,0,4};
		Boolean res = jum.canJump(nums);
		System.out.print(res);

	}

}
