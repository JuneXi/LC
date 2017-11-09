package company.facebook;

import java.util.ArrayList;
import java.util.List;

/*Remove the minimum number of invalid parentheses in order to make the input string valid. Return all possible results.

Note: The input string may contain letters other than the parentheses ( and ).

Examples:
"()())()" -> ["()()()", "(())()"]
"(a)())()" -> ["(a)()()", "(a())()"]
")(" -> [""]*/

public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<String>();
        if(s == null || s.length() == 0){
        	res.add("");
            return res;
        }
        
        remove(s, 0, res, 0, new char[] {'(', ')'} );
        return res;
    }
    
    private void remove(String s, int cur, List<String> res, int last_removed, char[] brace){
        //note: i = cur, not 0
        int counter = 0;
        for(int i = cur; i < s.length(); i++){
            if(s.charAt(i) == brace[0]){
                counter++;
            }
            if(s.charAt(i) == brace[1]){
                counter--;
            }
            //note: notice here
            if(counter >= 0){
                continue;
            }
            for(int j = last_removed; j <= i; j++){
            	//note: j == last_removed 注意顺序问题，以免j = 0 outof Bounds
                if(s.charAt(j) == brace[1] && (j == last_removed || s.charAt(j - 1) != brace[1])){
                    remove(s.substring(0, j) + s.substring(j + 1, s.length()), i, res, j, brace);
                }
            }
            return;           
            
        }
        //code below to check the condition if we have more '('
        //note: use StringBuilder
        String s2 = new StringBuilder(s).reverse().toString();
        if(brace[0] == '('){
        	remove(s2, 0, res, 0, new char[]{')', '('});
        }else{
        	res.add(s);
        }
        
    }

}
