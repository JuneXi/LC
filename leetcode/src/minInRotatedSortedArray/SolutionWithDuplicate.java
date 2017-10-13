package minInRotatedSortedArray;

public class SolutionWithDuplicate {
    public int findMin(int[] nums) {
    	if(nums.length == 0 || nums == null){
    		return -1;
    	}
    	// res = nums[0]!!!!!
        int res = nums[0];
    	for( int i = 0; i < nums.length; i++){
    		if(res > nums[i]){
    			res = nums[i];
    		}
    	}
    	return res;
    }

}
