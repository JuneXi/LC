package company.google;

/*Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

You may assume that the given expression is always valid.

Some examples:
"1 + 1" = 2
" 2-1 + 2 " = 3
"(1+(4+5+2)-3)+(6+8)" = 23
Note: Do not use the eval built-in library function.*/

public class BasicCalculator2WrongWay {
	public int calculate(String s) {
		if(s == null || s.length() == 0){
			return 0;
		}
		//sign before '(';
		int b = 1;
		//previous + or -
		int p = 1;;
		int res = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				continue;
			}
			if(s.charAt(i) == '+'){
				p = 1;
			}else if(s.charAt(i) == '-'){
				p = -1;
			}else if(s.charAt(i) == '('){
				if(p == -1){
					b = -1;
					//note : reset p!
					p = 1;
				}
			}else if(s.charAt(i) == ')'){
				b = 1;
			}else{
				//what if 324? not a single number?
				//int - '0'
				int val = s.charAt(i) - '0';
				for(int j = i + 1; j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9'; j++){
					val = val * 10 + (s.charAt(j) - '0');
					//note: don't forget i++!!!!
					i++;
				}
				res = res + p * b * val;
			}
		}
        return res;
    }

}
