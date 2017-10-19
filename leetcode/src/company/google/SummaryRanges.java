package company.google;

import java.util.ArrayList;
import java.util.List;

/*Given a sorted integer array without duplicates, return the summary of its ranges.

Example 1:
Input: [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Example 2:
Input: [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]*/

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
    	List<String> res = new ArrayList<String>();
    	if(nums == null || nums.length == 0){
    		return res;
    	}
    	if(nums.length == 1){
    		res.add("" + nums[0]);
    		return res;
    	}
    	for(int i = 0; i < nums.length; i++){
    		int a = nums[i];
    		while(i + 1 < nums.length && nums[i] + 1 == nums[i+ 1]){
    			i++;
    		}
    		if(a == nums[i]){
    			res.add("" + a);
    		}else{
    			res.add(a + "->" + nums[i]);
    		}
    	}
    	return res;
    }

}
