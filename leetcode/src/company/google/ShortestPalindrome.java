package company.google;

/*Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.

For example:

Given "aacecaaa", return "aaacecaaa".

Given "abcd", return "dcbabcd".*/

//我们能看出回文数必须从原string的第一个字母开始。
//如果s太长会超时
public class ShortestPalindrome {
	public String shortestPalindrome(String s) {
        if(s == null || s.length() <= 1){
        	return s;
        }
        
        return res;
	
	
	}
	
}
