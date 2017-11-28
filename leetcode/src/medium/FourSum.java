package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i -1]){
                continue;
            }
            for(int j = i + 1; j < nums.length; j++){
                if(j != i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int begin = j + 1;
                int end = nums.length - 1;
                int temp = nums[i] + nums[j];
                while(begin < end){
                    int sum = temp + nums[begin] + nums[end];
                    if(sum > target){
                        end--;
                    }else if(sum < target){
                        begin++;
                    }else{
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[begin]);
                        list.add(nums[end]);
                        res.add(new ArrayList<Integer>(list));
                        //note: can't break here, keep search
                        begin++;
                        end--;
                        while(begin < end && nums[begin] == nums[begin - 1]) begin++;
                        while(begin < end && nums[end] == nums[end + 1]) end--;
                    }
                }
            }
        }
        return res;
    }

}
