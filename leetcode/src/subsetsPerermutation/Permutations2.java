package subsetsPerermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(nums == null && nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int[] visited = new int[nums.length];
        dfs(res, list, nums, visited);
        return res;
        
    }
    
    private void dfs(ArrayList<List<Integer>> res, ArrayList<Integer> list, int[] nums, int[] visited){
        if(list.size() == nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == 1 || (i != 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0)){
                continue;
            }
            list.add(nums[i]);
            visited[i] = 1;
            dfs(res, list, nums, visited);
            list.remove(list.size() - 1);
            visited[i] = 0;
        }
        
    }

}
