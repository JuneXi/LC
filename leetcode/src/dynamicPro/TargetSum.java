package dynamicPro;

/*You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

Find out how many ways to assign symbols to make sum of integers equal to target S.

Example 1:
Input: nums is [1, 1, 1, 1, 1], S is 3. 
Output: 5
Explanation: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

There are 5 ways to assign symbols to make the sum of nums be target 3.
*/
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
    	int sum = 0;
    	for(int n: nums){
    		sum = sum + n;
    	}
    	if((sum + S) % 2 != 0 || sum < S){
    		return 0;
    	}    
    	sum = (sum + S) / 2;
    	//dp[i] : how many ways to make sum = i
    	int[] dp = new int[sum + 1];
    	dp[0] = 1;
    	// use n1 or not, dp[i]
    	// when we can have n1, use n2 or not, dp[i]
    	// when we can have n1 and n2, use n3 or not, dp[i]
    	for( int n : nums){
    		for(int i = sum; i >= n; i--){
    			dp[i] = dp[i] + dp[i - n];
    		}
    	}   	
        return dp[sum];
    }

}
