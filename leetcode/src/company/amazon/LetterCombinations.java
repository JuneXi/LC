package company.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].*/
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
    	ArrayList<String> res = new ArrayList<String>();
    	if(digits == null || digits.length() == 0){
    		return res;
    	}
    	Map<Integer,String> map = new HashMap<Integer, String>();
    	map.put(0,"0");
    	map.put(1, "1");
    	map.put(2,"abc");
    	map.put(3, "def");
    	map.put(4, "ghi");
    	map.put(5, "jkl");
    	map.put(6, "mno");
    	map.put(7, "pqrs");
    	map.put(8, "tuv");
    	map.put(9, "wxyz");
    	StringBuilder sb = new StringBuilder();
    	helper(res, sb, digits, map, 0);
    	return res;
    	
        
    }
    
    private void helper(ArrayList<String> res, StringBuilder sb, String digits, Map<Integer,String> map, int cur){
    	if(sb.length() == digits.length()){
    		res.add(sb.toString());
    		return;
    	}
    	for(int i = 0; i < digits.length(); i ++){
    		
    	}
    	
    }

}
