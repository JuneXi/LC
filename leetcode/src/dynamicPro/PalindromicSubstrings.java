package dynamicPro;

/*Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".*/

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
    	int l = s.length();
    	boolean[][] isTrue = new boolean[l][l];
    	int count = 0;
    	//initialize
    	for(int i = 0; i < l; i++){
    		isTrue[i][i] = true;
    		count++;
    	}
    	for(int i = 0; i < l - 1; i++){
    		if(s.charAt(i) == s.charAt(i + 1)){
    		isTrue[i][i + 1] = true;
    		count++;}
    	}
    	//DP
    	for(int j = 2; j < l; j++){
    		for(int i = 0; i + j < l; i++){
    			if(s.charAt(i) == s.charAt(i + j) && isTrue[i + 1][i + j - 1]){
    				isTrue[i][i + j] = true;
    				count++;
    			}
    		}
    	}
    	return count;
    }
    	


}
