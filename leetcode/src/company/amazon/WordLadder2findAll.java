package company.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Given two words (beginWord and endWord), and a dictionary's word list, find all shortest transformation sequence(s) from beginWord to endWord, such that:

Only one letter can be changed at a time
Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
For example,

Given:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log","cog"]
Return
  [
    ["hit","hot","dot","dog","cog"],
    ["hit","hot","lot","log","cog"]
  ]*/
public class WordLadder2findAll {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if(wordList == null || wordList.size() == 0){
        	return null;
        }
        
        ArrayList<List<String>> res = new ArrayList<List<String>>();
        wordList.add(beginWord);
    	//1. initialize a map to describe relationship between all words in wordList
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String word: wordList){
        	createMap(map, wordList, word);
        }
        //for test
        System.out.println("map created as follow");
        for(String word: wordList){
        	System.out.println(word + ":\t");
        	ArrayList<String> testNextWord = map.get(word);
        	for(String shuchu: testNextWord){
        		System.out.print(shuchu + "\t");
        	}
        	System.out.println();
        }
        
    	//2. dfs to find a solution and add to result
        ArrayList<String> nextWord = new ArrayList<String>();
        dfs(beginWord, endWord, map, res, nextWord);
        return res;
    	
    }
    
    private void createMap(Map<String, ArrayList<String>> map, List<String> wordList, String word){
    	ArrayList<String> l = new ArrayList<String>();
    	for(int i = 0; i < word.length(); i++){
    		for(char c = 'a'; c <= 'z'; c++){
    			if(word.charAt(i) == c)continue;
    			String newWord = replace(word, c , i);
    			if(wordList.contains(newWord) && !l.contains(newWord)){
    				l.add(newWord);
    			}
    		}
    	}
    	map.put(word, l);
    }
    
    private String replace(String word, char c, int i){
    	char[] a = word.toCharArray();
    	a[i] = c;
    	return new String(a);
    }
    
    private void dfs(String beginWord, String endWord, Map<String, ArrayList<String>> map, ArrayList<List<String>> res, ArrayList<String> nextWord){
    	if(beginWord.equals(endWord)){
    		nextWord.add(beginWord);
    		System.out.println("we find a list");
    		res.add(new ArrayList<String>(nextWord));
    		return;
    	}  		
    	
    	//test code begin
    	System.out.println("now we will add " + beginWord + ", after that our list is :");
    	nextWord.add(beginWord);
    	for(String testWord: nextWord){
    		System.out.print(testWord + "\t");
    	}
    	System.out.println();
    	//test code end
    	
    	
    	ArrayList<String> list = map.get(beginWord); 
    	
    	//test code begin
    	System.out.println("and the next wordList is:");
    	for(String testList: list){
    		System.out.print(testList + "\t");
    	}
    	System.out.println();
    	//test code end
    	
    	if(list == null || list.size() == 0){
    		return;
    	}
    	for(String word: list){
    		if(nextWord.contains(word)){
    			continue;
    		}
    		dfs(word, endWord, map, res, nextWord);
    		System.out.println("remove last word");
    		nextWord.remove(nextWord.size() - 1);
    	}
    }

}
