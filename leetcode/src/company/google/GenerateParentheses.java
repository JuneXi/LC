package company.google;

import java.util.ArrayList;
import java.util.List;

/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]*/
public class GenerateParentheses {
public List<String> generateParenthesis(int n) {
	List<String> res = new ArrayList<String>();
	if(n < 1){
		return res;
	}
	
	helper(res, "", 0, 0, n);
    return res;   
    }

	private void helper(List<String> res, String s, int open, int close, int n){
		if(s.length() == n * 2){
			res.add(s);
			return;
		}
		if(open < n){
			helper(res, s.concat("("), open + 1, close, n);
		}
		if(close < open){
			helper(res, s.concat(")"), open, close + 1, n);
		}
		
	}

}
