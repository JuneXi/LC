package dynamicPro;

/*Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.

For example, given s = "aab",
Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
*/
public class PalindromePartitioning2 {
    public int minCut(String s) {
    	int l = s.length();
    	int[] dp = new int[l + 1];
    	
    	//initialize Palindrome
    	boolean[][] isP = new boolean[l][l];
    	for(int i = 0; i < l; i++){
    		isP[i][i] = true;
    	}
    	for(int i = 0; i < l - 1; i++){
    		isP[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
    	}
    	for(int j = 2; j < l; j++){
    		for(int i = 0; i + j < l; i++){
    			isP[i][i + j] = (s.charAt(i) == s.charAt(i + j)) && isP[i + 1][i + j - 1];
    		}
    	}
    	//initialize dp
    	for(int i = 0; i <= l; i++){
    		dp[i] = i - 1;
    	}

    	for(int i = 0; i <= l; i++){
    		for(int j = 0; j < i; j++){
    			if(isP[j][i - 1]){
    				dp[i] = Math.min(dp[i], dp[j] + 1);
    			}
    		}
    	}
    	return dp[l];
        
    }

}
