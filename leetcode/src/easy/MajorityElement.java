package easy;

import java.util.HashMap;

/*Given an array of size n, find the majority element. The majority element is the element that appears more than n/2times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

public class MajorityElement {
	public int majorityElement(int[] nums) {
		if(nums == null || nums.length == 0 ){
			return 0;
		}
        if(nums.length == 1) return nums[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i ++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i], 1);
			}else{
				//note: order 
				map.put(nums[i], map.get(nums[i]) + 1);
				if(map.get(nums[i]) > nums.length / 2){
					return nums[i];
				}
			}
				
		}
        return 0;
    }

}
