package dynamicPro;

import java.util.HashSet;
import java.util.Set;

public class LargestPlusSign2 {
	
	   public int orderOfLargestPlusSign(int N, int[][] mines) {
	        Set<Integer> banned = new HashSet();
	        int[][] dp = new int[N][N];
	        
	        //store the location of mins in a Set
	        for (int[] mine: mines)
	            banned.add(mine[0] * N + mine[1]);
	        int ans = 0, count;
	        
	        for (int r = 0; r < N; ++r) {
	            
	            count = 0;
	            //check if cur location is a mine and count the left continues 1s
	            for (int c = 0; c < N; ++c) {               
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = count;
	            }
	            
	            count = 0;
	            //count the right conitnues 1s
	            for (int c = N-1; c >= 0; --c) {
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = Math.min(dp[r][c], count);
	            }
	        }
	        
	        for (int c = 0; c < N; ++c) {
	            count = 0;
	            //up continues 1;
	            for (int r = 0; r < N; ++r) {
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = Math.min(dp[r][c], count);
	            }
	            
	            count = 0;
	            //down continues 1s
	            for (int r = N-1; r >= 0; --r) {
	                count = banned.contains(r*N + c) ? 0 : count + 1;
	                dp[r][c] = Math.min(dp[r][c], count);
	                
	                ans = Math.max(ans, dp[r][c]);
	            }
	        }
	        
	        return ans;
	    }

}
