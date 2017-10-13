package minInRotatedSortedArray;

public class Solution {
    public int findMin(int[] nums) {
        if( nums.length == 0 || nums == null){
        	return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        
        // check if rotated, what if nums.length = 1?
        if(nums[0] <= nums[end]){
        	return nums[0];
        }
        
        while( start +1 < end){
        	int mid = start + (end - start)/2;
        	if(nums[mid] > nums[end]){
        		start = mid;
        	}
        	else{
        		end = mid;
        	}
        }
        if(nums[start] < nums[end]){
        	return start;
        }
        return end;
        
    }

}
