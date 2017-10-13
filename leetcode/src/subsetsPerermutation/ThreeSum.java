package subsetsPerermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	// time exceed
    public List<List<Integer>> threeSum(int[] nums) {
    	ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Arrays.sort(nums);
    	threeSumHelper(0, nums, list, res, 0);
        return res;
    }
    public void threeSumHelper(int sum, int[] nums, ArrayList<Integer> list, ArrayList<List<Integer>> res, int pos){
    	if(list.size() == 3 && sum == 0){
    		// must new
    		res.add(new ArrayList<Integer>(list));
    	}
    	for(int i = pos; i < nums.length; i++){
    		if(i != pos && nums[i] == nums[i - 1]){
    			continue;
    		}
    		list.add(nums[i]);
    		sum = sum + nums[i];
    		threeSumHelper(sum, nums, list, res, i + 1);
    		list.remove(list.size() - 1);
    		sum = sum - nums[i];
    	}
    	
    }
}
