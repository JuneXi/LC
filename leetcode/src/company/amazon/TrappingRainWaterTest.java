package company.amazon;

public class TrappingRainWaterTest {

	public static void main(String[] args) {
		TrappingRainWater trap = new TrappingRainWater();
		int[] height = {6,4,2,0,3,2,0,3,1,4,5,3,2,7,5,3,0,1,2,1,3,4,6,8,1,3};
		int sum = trap.trap(height);
		System.out.print(sum);

	}

}