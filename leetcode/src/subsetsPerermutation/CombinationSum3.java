package subsetsPerermutation;

import java.util.ArrayList;
import java.util.List;

/*Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]*/

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        if(n > 50 || k > 9 || (19 - k) * k / 2 < n){
            return res;
        }
        helper(res, list, k, n, 1);
        return res;
        
    }
    private void helper(List<List<Integer>> res, ArrayList<Integer> list, int k, int n, int pos){
        if(n == 0 && k == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = pos; i < 10; i++){
            list.add(i);
            helper(res, list, k - 1, n - i, i + 1);
            list.remove(list.size() - 1);
        }
    }

}
