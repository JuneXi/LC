package dynamicPro;

/*Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?*/

public class LIS {
    public int lengthOfLIS(int[] nums) {
    	int m = nums.length;
        if(m < 2){
        	return m;
        }
        //TODO: binary search
        int[] res = new int[m];
        int n = 1;
        for(int i = 0; i < m; i++){
        	res[i] = Math.max(1, res[i]);
        	for(int j = i + 1;j < m; j++){
        		if(nums[j] > nums[i]){
        			res[j] = Math.max(res[j], res[i] + 1);
        			n = Math.max(n, res[j]);
        		}
        	}
        }
        return n;

    }

}
