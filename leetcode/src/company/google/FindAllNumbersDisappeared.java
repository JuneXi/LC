package company.google;

import java.util.ArrayList;
import java.util.List;

/*Given an array of integers where 1 ¡Ü a[i] ¡Ü n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
*/

public class FindAllNumbersDisappeared {
public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> res = new ArrayList<Integer>();    
	if(nums == null || nums.length == 0){
        	return res;
    }
	for(int i = 0; i < nums.length; i++){
		//must do abs here, if not, we may change latter value
		int val = Math.abs(nums[i]); 
		if(val >= 1 && val <= nums.length){			
			nums[val - 1] = - Math.abs(nums[val - 1]);
		}
	}
	for(int i = 0; i < nums.length; i++){
		if(nums[i] < 0){
			res.add(i + 1);
		}
	}
	return res;
    }


}
