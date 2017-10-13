package company.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {

		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		//return [] not null
		if(nums == null || nums.length < 3){
			return res;
		}
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++){
			if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
				int start = i + 1;
				int end = nums.length - 1;
				while(start < end){
					if(nums[start] + nums[end] == -nums[i]){
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[start]);
						list.add(nums[end]);
						res.add(new ArrayList<Integer>(list));
						while(start < end && nums[start] == nums[start + 1]){
							start++;
						}
						while(start < end && nums[end] == nums[end - 1]){
							end--;
						}
						start++;
						end--;
					}else if(nums[start] + nums[end] + nums[i] < 0){
						start++;
					}else{
						end--;
					}
				}
			}
		}
		return res;
		}

}
