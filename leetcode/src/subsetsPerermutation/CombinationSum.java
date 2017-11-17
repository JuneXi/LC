package subsetsPerermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]*/

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0){
        	return res;
        }
        Arrays.sort(candidates);
        ArrayList<Integer> list = new ArrayList<>();
        search(res, candidates, target,0, list);
        return res;
    }
    
    private void search(ArrayList<List<Integer>> res, int[] can, int target, int pos, ArrayList<Integer> list){
    	if(target == 0){
    		res.add(new ArrayList<Integer>(list));
    		return;
    	}
    	//note: use if in loop to check here, it's easier to break
/*    	if(target < 0){
    		return;
    	}*/
    	for(int i = pos; i < can.length; i++){
    		//note: how to handle here
    		if(can[i] > target){
    			break;
    		}
    		if(i != pos && can[i] == can[i - 1]){
    			continue;
    		}
    		list.add(can[i]);
    		search(res, can, target - can[i], i, list);
    		list.remove(list.size() - 1);
    	}
    }

}
