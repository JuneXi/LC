package company.facebook;

import java.util.HashMap;
import java.util.Map;

/*Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.*/

public class MinimumWindowSubstring {
	public String minWindow(String s, String t) {
        if(t == null || t.length() == 0){
            return "";
        }
            if(s.length() < t.length()){
                return "";
            }
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count = t.length();
        int begin = 0, end = 0, l = Integer.MAX_VALUE, head = 0;
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();
        
        for(char c : t2){
        	if(map.containsKey(c)){
        	map.put(c, map.get(c) + 1); 
        	}else{
        		map.put(c, 1);
        	}
        }
        
        while(end < s.length()){
        	if(map.containsKey(s2[end])){  
        		map.put(s2[end], map.get(s2[end]) - 1); 
        		if(map.get(s2[end]) >= 0){
        			count--;
        		}
        	}
            end++;
            
            while(count == 0){
                if(end - begin < l){
                    l = end - begin;
                    head = begin;
                }
                
                //note: check if contain firstly
                if(map.containsKey(s2[begin])){
                	map.put(s2[begin], map.get(s2[begin]) + 1);               
                	if(map.get(s2[begin]) > 0){
                		count++;
                	}
                }
                begin++;
                
            }
            
        }
        return (l == Integer.MAX_VALUE)? "" : s.substring(head, head + l);
        
    }

}
