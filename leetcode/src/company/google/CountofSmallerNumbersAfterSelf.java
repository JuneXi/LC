package company.google;

import java.util.ArrayList;

/*	You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

Example:

Given nums = [5, 2, 6, 1]

To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element.*/

public class CountofSmallerNumbersAfterSelf {
	public List<Integer> countSmaller(int[] nums) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(nums == null || nums.length == 0){
			return res;
		}
        
    }


}
