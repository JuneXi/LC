package company.amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    	Set<String> dict = new HashSet<String>();
    	if(!wordList.contains(endWord)){
    		return 0;
    	}
    	for(String word: wordList){
    		dict.add(word);
    	}
    	if(beginWord == null || endWord == null || beginWord.length() == 0 || endWord.length() == 0){
    		return 0;
    	}
        if(beginWord.length() != endWord.length()){
        	return 0;
        }
        if(wordList == null || wordList.size() == 0){
        	return 0;
        }
        //add endWord to the wordList!
        wordList.add(endWord);
        Queue<String> q = new LinkedList<String>();
        Set<String> used = new HashSet<String>();
        q.offer(beginWord);
        used.add(beginWord);
        //why 1?
        int step = 1;
        while(!q.isEmpty()){
        	step++;
        	int l = q.size();
        	for(int i = 0; i < l; i++){
        		String cur = q.poll();
        		ArrayList<String> nextWord = new ArrayList<String>();
            	for(char c = 'a'; c <= 'z'; c++){
            		for(int j = 0; j < cur.length(); j++){
            			if(c == cur.charAt(j)){
            				continue;
            			}
            			String temp = replace(cur, c, j);
            			if(wordList.contains(temp)){
            				nextWord.add(temp);    		
            			}
            		}
            	}
        		for(String next: nextWord){
        			if(next.equals(endWord)){
        				return step;
        			}
        			if(used.contains(next)){
        				continue;
        			}
        			q.offer(next);
        			used.add(next);
        		}
        		
        	}
        }
        return 0;
    }

    private ArrayList<String> getNext(String cur, Set<String> wordList){
    	ArrayList<String> res = new ArrayList<String>();
    	for(char c = 'a'; c <= 'z'; c++){
    		for(int i = 0; i < cur.length(); i++){
    			if(c == cur.charAt(i)){
    				continue;
    			}
    			String nextWord = replace(cur, c, i);
    			if(wordList.contains(nextWord)){
    				res.add(nextWord);    			}
    		}
    	}
    	return res;
    }
    
    private String replace(String cur, char c, int i){
    	char[] newString = cur.toCharArray();
    	newString[i] = c;
    	return new String(newString);
    }
}
