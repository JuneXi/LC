package rotateArray;

import java.util.Arrays;

public class Solution {
public void rotate(int[] nums, int k) {
	
	//if k = length or 0, no change
	
	if( nums.length > 0&&k!=0){
		//what if k > length
		k = k % nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
		
	}
	System.out.print(Arrays.toString(nums));
    }
public void reverse(int[] nums, int start, int end){
	while(start < end){
		int tem = nums[start];
		nums[start++] = nums[end];
		nums[end--] = tem;
}
}


}
