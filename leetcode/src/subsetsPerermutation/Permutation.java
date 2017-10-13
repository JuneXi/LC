package subsetsPerermutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
    	if( nums.length == 0 || nums == null){
    		return null;
    	}
    	
    	ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	permuteHelper(result, list, nums);
    	return result;
        
    }
    
    private void permuteHelper(ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] nums ){
    	if(list.size() == nums.length){
    		result.add(new ArrayList<Integer>(list));
    	}
    	
    	for(int i = 0; i < nums.length; i++){
    		list.add(nums[i]);
    		permuteHelper(result, list, nums);
    		list.remove(list.size() - 1);
    	}
    }

}
