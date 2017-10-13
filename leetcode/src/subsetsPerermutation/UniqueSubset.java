package subsetsPerermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubset {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	if(nums.length == 0 || nums == null){
    		return null;
    	}    	
    	ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Arrays.sort(nums);
    	subsetHelper(result, nums, list, 0);
    	return result;
        
    }
    
    private void subsetHelper(ArrayList<List<Integer>> result, int[] nums, ArrayList<Integer> list, int pos){
    	result.add(new ArrayList<Integer>(list));  	
    	for(int i = pos; i < nums.length; i++){
    		if( i != pos && nums[i] == nums[i - 1]){
    			continue;
    		}
    		list.add(nums[i]);
    		subsetHelper(result, nums, list, i +1);
    		list.remove(list.size() - 1);
    	}
    }

}
