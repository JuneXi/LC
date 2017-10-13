package rotatedSortedArray2;

//with duplicate nums
//O(n) liner , go for loop
//e.g.    0 0 0 0 0 0 0 0 1 0

public class Solution {
    public boolean search(int[] nums, int target) {
    	if( nums.length == 0 || nums == null){
    		return false;
    	}
        
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] == target){
    			return true;
    		}
    	}
    	return false;
    }

}
