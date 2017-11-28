package subsetsPerermutation;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(k > n){
            return res;
        }
        ArrayList<Integer> list = new ArrayList<>();
        search(res, list, n, k, 1);
        return res;       
    }
    
    private void search(List<List<Integer>> res, ArrayList<Integer> list, int n, int k, int pos){
        if(k == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = pos; i <= n; i++){
            list.add(i);
            //TODO: note here: i +1 not pos + 1
            search(res, list, n, k - 1, i + 1);
            list.remove(list.size() - 1);
            
        }
    }

}
