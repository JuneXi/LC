package searchForARange;

public class Solution {
	public int[] searchRange(int[] nums, int target){
		if( nums.length == 0){
			return new int[]{-1, -1};
		}
		
		int start = 0;
		int end = nums.length-1;
		int mid = 0;
		int[] result = new int[2];
		
		// search left bound
		while(start + 1 < end){
			mid = start + (end - start)/2;
			if(nums[mid] < target){
				start = mid;				
			}
			else if (nums[mid]>target){
				end = mid;
			}
			else {
				end = mid;				
			}
		}
		if(nums[start] == target){
			result[0] = start;
		}
		else if(nums[end] == target){
			result[0] = end;
		}
		else{
			return new int[]{-1,-1};
		}
		
		//search right bound
		start = 0;
		end = nums.length-1;
		while(start + 1 < end ){
			mid = start + (end - start)/2;
			if(nums[mid] < target){
				start = mid;
			}
			else if(nums[mid] > target){
				end = mid;
			}
			else{
				start = mid;
			}
		}
		
		//notice the order
		if(nums[end] == target){
			result[1] = end;
		}
		else if(nums[start] == target){
			result[1] = start;
		}
		else{
			return new int[]{-1,-1};
		}
		return result;
		
	}

}
