package dynamicPro;

import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
        
        if(coins == null || coins.length == 0 || amount < 0){
            return -1;
        }
        if(amount == 0){
            return 0;
        }
        
        //initialize
        int[] dp = new int[amount + 1];
        
        //no need to fill with MAX
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i : coins){
            //boundray
            if(i <= amount){
                dp[i] = 1;
            }
        }
        
        for(int i = 1; i < amount + 1; i++){
            //note: important, how to cal the dp value????
            for(int j = 0; j < coins.length; j ++){
            	//note the condition
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[ i - coins[j]] + 1);
                }
                
            }
        }
        
        return (dp[amount] == amount + 1)? -1 : dp[amount];
           
    }

}
