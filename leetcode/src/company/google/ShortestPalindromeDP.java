package company.google;

/*Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.

For example:

Given "aacecaaa", return "aaacecaaa".

Given "abcd", return "dcbabcd".*/

//我们能看出回文数必须从原string的第一个字母开始。
//如果s太长会超时
public class ShortestPalindromeDP {
	public String shortestPalindrome(String s) {
        if(s == null || s.length() <= 1){
        	return s;
        }
        //if from i to j is Palindrome
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i = 0; i < dp.length; i++){
        	dp[i][i] = true;
        }
        //note: if you have i + 1, don't forget the boundry
        for(int i = 0; i < dp.length - 1; i++){
        	dp[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
        }
        
        for( int j = 2; j < s.length(); j++){
        	for(int i = 0; i + j < s.length(); i++){
        		dp[i][i + j] = (s.charAt(i) == s.charAt(i + j))&& dp[i + 1][i + j - 1];
        	}
        }
        int end = 0;
        for(int i = dp.length - 1; i > 0; i--){
        	if(dp[0][i]){
        		end = i;
        		//don't forget to break
        		break;
        	}
        }
        String res = "";
        for(int i = s.length() - 1; i > end; i--){
        	res = res + s.charAt(i);
        }
        //note: res = res.concat
        res = res.concat(s);
        return res;
	
	
	}
	
}
