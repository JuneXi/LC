
package company.amazon;

/*Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Therefore, return the max sliding window as [3,3,5,5,6,7].*/


//TODO: nothing to say, just remember that!!!!
public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums == null || nums.length == 0){
			return null;
		}
		
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		for(int i = 0; i < left.length; i++){
			if(i % k == 0){
				left[i] = nums[i];
			}else{
				left[i] = Math.max(nums[i], nums[i - 1]);
			}
			
			int j = left.length - i - 1;
			if(j % k == 0){
				right[j] = nums[j];
			}else{
				right[j] = Math.max(nums[j], nums[j + 1]);
			}
		}
		
		int[] res = new int[nums.length - k + 1];
		for(int i = 0; i < res.length; i++){
			res[i] = Math.max(right[i + k - 1],left[] )
		}
		
		
        
    }
}
