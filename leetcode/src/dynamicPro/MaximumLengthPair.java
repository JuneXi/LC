package dynamicPro;

import java.util.Arrays;

/*You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.

Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.

Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.

Example 1:
Input: [[1,2], [2,3], [3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4]*/

public class MaximumLengthPair {
    public int findLongestChain(int[][] pairs) {
    	int num = pairs.length;
    	int[] dp = new int[num];
    	Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
    	for(int i = 0; i < num; i++){
    		for(int j = 0; j < i; j++){
    			if(pairs[i][0] > pairs[j][1]){
    				dp[i] = Math.max(dp[i], dp[j] + 1);
    			}
    		}
    	}
    	return dp[num - 1] + 1;
    }

}
