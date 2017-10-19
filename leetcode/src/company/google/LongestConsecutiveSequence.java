package company.google;

import java.util.HashMap;
import java.util.Map;

/*Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.*/

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		if(nums == null){
			return 0;
		}
		if(nums.length <= 1){
			return nums.length;
		}
		int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			if(!map.containsKey(nums[i])){
				int left = map.containsKey(nums[i] - 1)? map.get(nums[i] -1) : 0;
				int right = map.containsKey(nums[i] + 1)? map.get(nums[i] + 1) : 0;
				int sum = right + 1 + left;
				map.put(nums[i], sum);
				map.put(nums[i] - left, sum);
				map.put(nums[i] + right, sum);
				res = Math.max(res, sum);
			}
		}
		return res;
    }

}
