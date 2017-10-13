package dynamicPro;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
    	if(s.length() <= 1){
    		return s.length();
    	}
    	Set<Character> read = new HashSet<Character>();
    	int length = 0;
    	for(int i = 0; i < s.length(); i++){
    		if(!read.contains(s.charAt(i))){
    			read.add(s.charAt(i));
    		}else{
    			read.remove(s.charAt(i));
    			length = length + 2;
    		}
    		
    	}
    	if(!read.isEmpty()){
    		return length + 1;
    	}
    	return length;
    }

}
