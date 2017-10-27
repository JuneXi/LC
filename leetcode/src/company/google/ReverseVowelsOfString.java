package company.google;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
	//TODO: faster using hashset?
    public String reverseVowels(String s) {
    	if(s == null || s.length() == 0){
    		return s;
    	}
    	//chaptin 
    	String vowels = "aeiouAEIOU";
    	//easier to modify s in a array
    	char[] chars = s.toCharArray();
    	int start = 0;
    	int end = chars.length - 1;
    	
    	while(start < end){
    		// + " " : easiest way here. don't forget contains(String)
    		while(start < end && !vowels.contains(chars[start] + "")){
    			start ++;
    		}
    		while(start < end && !vowels.contains(chars[end] + "")){
    			end--;
    		}
    		char temp = chars[start];
    		chars[start] = chars[end];
    		chars[end] = temp;
    		
    		start++;
    		end--;
    	}
    	//note: can't use toString() here
    	//return chars.toString();
    	return new String(chars);
        
    }

}
