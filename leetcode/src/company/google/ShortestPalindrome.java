package company.google;

/*Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.

For example:

Given "aacecaaa", return "aaacecaaa".

Given "abcd", return "dcbabcd".*/

//我们能看出回文数必须从原string的第一个字母开始。
//如果s太长会超时
//TODO: review KMP

public class ShortestPalindrome {
	public String shortestPalindrome(String s) {
        if(s == null || s.length() <= 1){
        	return s;
        }
        // note: use SB here
        String temp = s + "#" + new StringBuilder(s).reverse();
        int[] kmp = new int[temp.length()];
        int index = 0;
        //note: start from 1
        for(int i = 1; i < temp.length(); i++){
        	if(temp.charAt(index) == temp.charAt(i)){
        		index ++;
        		kmp[i] = kmp[i - 1] + 1;
        	}else{
        		index = kmp[i - 1];
        		while(index > 0 && temp.charAt(index) != temp.charAt(i)){
        			index = kmp[index - 1];
        		}
        		if(temp.charAt(index) == temp.charAt(i)){
        			index++;
        		}
        		kmp[i] = index;
        	}
        }
        return new StringBuilder(s.substring(kmp[temp.length() - 1])).reverse() + s;
        
	}
	
}
