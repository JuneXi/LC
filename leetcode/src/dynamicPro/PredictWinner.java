package dynamicPro;

/*Given an array of scores that are non-negative integers. Player 1 picks one of the numbers from either end of the array followed by the player 2 and then player 1 and so on. Each time a player picks a number, that number will not be available for the next player. This continues until all the scores have been chosen. The player with the maximum score wins.

Given an array of scores, predict whether player 1 is the winner. You can assume each player plays to maximize his score.

Example 1:
Input: [1, 5, 2]
Output: False
Explanation: Initially, player 1 can choose between 1 and 2. 
If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2). 
So, final score of player 1 is 1 + 2 = 3, and player 2 is 5. 
Hence, player 1 will never be the winner and you need to return False.*/

public class PredictWinner {
    public boolean PredictTheWinner(int[] nums) {
    	int len = nums.length;
    	int[] dp = new int[len];
    	/*for(int i = 0; i < len; i++){
    		for(int j = i ; j >= 0; j--){
    			if(i == j){
    				dp[i] = nums[i];
    			}else{
    				dp[i] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
    			}
    		}
    	}*/
    	
    	for(int i = len - 1; i >= 0; i--){
    		for(int j = i; j < len; j++){
    			if( i == j){
    				dp[i] = dp[j];
    			}else{
    			dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);}
    		}
    	}
        return dp[len - 1] >= 0;
    }

}
