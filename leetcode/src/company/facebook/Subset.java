package company.facebook;

import java.util.ArrayList;
import java.util.List;

public class Subset {
	public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> set = new ArrayList<Integer>();
        subsetHelper(nums, res, set, 0);
        return res;
    }
    
    private void subsetHelper(int[] nums, List<List<Integer>> res, ArrayList<Integer> set, int cur){
        res.add(new ArrayList<Integer>(set));
        for(int i = cur; i < nums.length; i++){
            set.add(nums[i]);
            subsetHelper(nums, res, set, i + 1);
            set.remove(set.size() - 1);
            
        }
    }

}
