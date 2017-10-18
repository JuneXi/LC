package company.google;

/*Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") ¡ú false
isMatch("aa","aa") ¡ú true
isMatch("aaa","aa") ¡ú false
isMatch("aa", "a*") ¡ú true
isMatch("aa", ".*") ¡ú true
isMatch("ab", ".*") ¡ú true
isMatch("aab", "c*a*b") ¡ú true*/

public class RegularExpresssionMatching {
	//note: map s to p, so p can be longer than s or have unmathced char
	public boolean isMatch(String s, String p) {
        if(s == null || s.length() == 0){
        	return true;
        }
        if(p == null || p.length() == 0){
        	return false;
        }
        //if pre i char in s can match pre j char in p
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        
        for(int j = 0; j < p.length(); j++){
        	if(p.charAt(j) == '*' && dp[0][j - 1]){
        		//note: j + 1, not j
        		dp[0][j + 1] = true;
        	}
        }
        //TODO: j ? j+1? j-1?
        for(int i = 1; i <= s.length(); i++){
        	for(int j = 0; j <= p.length(); j++){
        		//s.i == p.j -> check dp[i - 1][j - 1]
        		if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.'){
        			dp[i][j] = dp[i - 1][j - 1];
        		}
        		
        		// a* has 3 meaning
        		//1. a* = null
        		//2. a* = a
        		//3. a* = aaaaaaaaa
        		if(p.charAt(j -1 ) == '*'){
        			//because p.j-1 != s.i, p.j-1 must be ignored, we can only assume a* = empty, then check dp[i][j - 2]
        			if(p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j -1) != '.'){
        				dp[i][j] = dp[i][j - 2];
        			}else{
        				//here p.j-1 can stay, so we must consider all three (p.j-1)* above
        				//when (p.j-1)* = null, dp[i][j] = dp[i][j - 2]
        				//when (p.j-1)* = p.j-1, dp[i][j] = dp[i][j - 1]
        				//when (p.j-1)* = (p.j-1)(p.j-1)(p.j-1)...well, it's not easy as above, dp[i][j] = dp[i - 1][j], e.g. below
        				//01234567           dp[7][3] = dp[6][3] -> dp[6][3] = dp[5][3] ->...
        				//aabbbbbb			 until dp[1][3], it's like we skip all continues b
        				//aab*
        				
        				dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || dp[i -1][j];
        				
        			}
        		}
        	}
        }
        return dp[s.length()][p.length()];
    }

}
