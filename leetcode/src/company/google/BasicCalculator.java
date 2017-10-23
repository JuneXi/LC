package company.google;

import java.util.Stack;

/*Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

You may assume that the given expression is always valid.

Some examples:
"1 + 1" = 2
" 2-1 + 2 " = 3
"(1+(4+5+2)-3)+(6+8)" = 23
Note: Do not use the eval built-in library function.*/

public class BasicCalculator {
	public int calculate(String s) {
		if(s == null || s.length() == 0){
			return 0;
		}
		//sign
		int sign = 1;
		int res = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < s.length(); i++){
			//note: how to write below?
			if(Character.isDigit(s.charAt(i))){
				//note: here - '0'
				int val = s.charAt(i) - '0';
				while(i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))){
					//note: here - '0'
					val = val * 10 + (s.charAt(i + 1) - '0');
					i++;
				}
				res = res + val * sign;
			}else if(s.charAt(i) == ' '){
				continue;
			}else if(s.charAt(i) == '+'){
				sign = 1;
			}else if(s.charAt(i) == '-'){
				sign = -1;
			}else if(s.charAt(i) == '('){
				stack.push(res);
				stack.push(sign);
				//reset
				res = 0;
				sign = 1;
			}else if(s.charAt(i) == ')'){
				res = res * stack.pop() + stack.pop();
			}else;
		}
        return res;
    }

}
