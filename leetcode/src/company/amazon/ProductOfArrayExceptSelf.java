package company.amazon;

/*Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
*/
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
    	int count = 0;
    	int product = 1;
    	int[] res = new int[nums.length];
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] != 0){
    			product = product * nums[i];
    		}else{
    			count++;
    		}
    	}
    	if(count >1){
    		return res;
    	}
    	if(count == 1){
    		for(int i = 0; i < nums.length; i++){
        		if(nums[i] != 0){
        			res[i] = 0;
        		}else{
        			res[i] = product;
        		}
        	}
    		return res;
    	}
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] != 0){
    			res[i] = product / nums[i];
    		}else{
    			res[i] = product;
    		}
    	}
       return res; 
    }

}
