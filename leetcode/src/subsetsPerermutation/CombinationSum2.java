package subsetsPerermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(candidates == null || candidates.length == 0){
            return res;
        }
        Arrays.sort(candidates);
        ArrayList<Integer> list = new ArrayList<>();
        search(res, list, candidates, target, 0);
        return res;       
    }
    
    private void search(ArrayList<List<Integer>> res, ArrayList<Integer> list, int[] candidates, int target, int pos){
        if(target == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = pos; i < candidates.length; i++){
            if(candidates[i] > target){
                break;
            }
            
            if(i != pos && candidates[i] == candidates[i - 1]){
    			continue;
    		}
            
            list.add(candidates[i]);
            search(res, list, candidates, target - candidates[i], i + 1);
            list.remove(list.size() - 1);
        }
        
    }

}
