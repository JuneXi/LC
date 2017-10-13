package dynamicPro;

public class LongestPalinSubseq {
/*    public int longestPalindromeSubseq(String s) {
    	int l = s.length();
    	int[][] dp = new int[l][l];
    	
    	//initialize
    	for(int i = 0; i < l; i++){
    		dp[i][i] = 1;
    	}
    	for(int i = 0; i < l - 1; i++){
    		dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1)? 2 : 1;
    	}
    	
    	for(int j = 2; j < l; j ++){
    		for( int i = 0; i + j < l; i ++){
    			if( s.charAt(i) == s.charAt(i + j)){
    				dp[i][i + j] = dp[i + 1][i + j - 1] + 2;
    			}else{
    				dp[i][i + j] = Math.max(dp[i + 1][i + j], dp[i][i + j - 1]) ;
    			}
    		}
    	}
    	return dp[0][l - 1];
    }*/
	
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }

}
