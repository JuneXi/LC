package removeDuplicateFromSortedArray2;
//TODO:
public class Solution {
	
    public int removeDuplicates(int[] nums) {
        if( nums.length == 0 || nums == null){
        	return 0;
        }
        
        if(nums.length < 3){
        	return nums.length;
        }
        
        int length = 0;
        for( int i = 0; i < nums.length-2; i++){
        	if(nums[i] != nums[i + 2]){
        		nums[length] = nums[i];
        		length++;
        	}

        }
        return length;
    }

}
