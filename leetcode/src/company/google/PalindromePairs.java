package company.google;

import java.util.ArrayList;
import java.util.List;

/*Given a list of unique words, find all pairs of distinct indices (i, j) in the given list, so that the concatenation of the two words, i.e. words[i] + words[j] is a palindrome.

Example 1:
Given words = ["bat", "tab", "cat"]
Return [[0, 1], [1, 0]]
The palindromes are ["battab", "tabbat"]
Example 2:
Given words = ["abcd", "dcba", "lls", "s", "sssll"]
Return [[0, 1], [1, 0], [3, 2], [2, 4]]
The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]*/

public class PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
    	ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(words == null || words.length == 0){
        	return res;
        }
        for(int i = 0; i < words.length; i++){
        	for(int j = 0; j < words.length; j++){
        		//note here
        		if(i == j)continue;
        		String newWord = words[i] + words[j];
        		if(isP(newWord)){
        			ArrayList<Integer> pair = new ArrayList<Integer>();
        			pair.add(i);
        			pair.add(j);
        			res.add(new ArrayList<Integer>(pair));
        		}
        	}
        }
        return res;
    }
    
    private boolean isP(String word){
    	for(int i = 0; i < word.length()/2; i++){
    		if(word.charAt(i) != word.charAt(word.length() - i - 1)){
    			return false;
    		}
    	}
    	return true;
    }

}
