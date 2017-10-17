package company.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class WL2improve {	
	Map<String, List<String>> map = new HashMap<String, List<String>>();
	ArrayList<List<String>> res = new ArrayList<List<String>>();
	
	 public List<List<String>> findLadders(String beginWord, String endWord, List<String> dict) {
	    	//important!!
		 Set<String> wordList = new HashSet<String>();
		 for(String s:dict){
			 wordList.add(s);
		 }
	    	
	    	if(!wordList.contains(endWord)){
	    		return res;
	    	}
	    	
	    	
	    	
	    	//initialize distance
	    	Map<String, Integer> distance = new HashMap<String, Integer>();    	
	    	for(String s: wordList){
	    		distance.put(s, Integer.MAX_VALUE);
	    	}
	    	distance.put(beginWord, 0);
	    	
	    	//add begin to wordlist
	    	wordList.add(beginWord);	
	    	
	    	//use bfs to find distance to begin Word 	
	    	bfs(beginWord, endWord, distance, wordList);
	    	
	    	//for test
/*	        System.out.println("map created as follow");
	        for(String word: wordList){
	        	System.out.println(word + ":\t");
	        	List<String> testNextWord = map.get(word);
	        	for(String shuchu: testNextWord){
	        		System.out.print(shuchu + "\t");
	        	}
	        	System.out.println();
	        }*/
	        
	        //here use LinkedList
	    	LinkedList<String> path = new LinkedList<String>();
	    	// use dfs to find all the list and add them into map
	    	// start from endWord, if condistion( distance == distance + 1 ), which can ensure we find the shortest path
	    	dfs(beginWord, endWord,  path);
	    	
	    	return res;
	        
	    }
	    
	    private void dfs(String word, String end, List<String> path){
	    	if(word.equals(end)){
	    		path.add(word);
	    		res.add(new ArrayList<String>(path));
	    		path.remove(path.size() - 1);
	    		return;
	    	}
	    	path.add(word);
	    	for(String s: map.get(word)){
	    		dfs(s, end, path);
	    	}
	    	path.remove(path.size() - 1);

	    }
	    
	    private void bfs (String begin, String end, Map<String, Integer> distance, Set<String> wordList){
	    	int min = Integer.MAX_VALUE;
	    	Queue<String> q = new LinkedList<String>();
	    	q.offer(begin);
	    	// bfs no recursion!!!!!!
	    	for(String s: wordList){
	    		map.put(s, new ArrayList<String>());
	    	}
	    	while(!q.isEmpty()){
	    		//get the first string
	    		String cur = q.poll();
	    		int step = distance.get(cur) + 1;
	    		if(step > min)break;
	    		//get the nextWord list
	    		for(int i = 0; i < cur.length(); i++){
	    			for(char c = 'a'; c <= 'z'; c++){
	    				if(cur.charAt(i) != c){
	    					String newWord = cur.substring(0, i) + c + cur.substring(i + 1);
	    					if(wordList.contains(newWord)){
	    						if(step > distance.get(newWord)){
	    							continue;
	    						}else if(step <distance.get(newWord)){
	    							distance.put(newWord, step);
	    		    				q.offer(newWord);
	    						}
	    						map.get(cur).add(newWord);
	    						
	    						if(newWord.equals(end)){
	    							min = step;
	    						}
	    					}
	    				}
	    			}
	    		}
	    		
	    	}//q is empty
	    }
	    
	    /*private List<String> getNext(String begin, List<String> wordList){
	    	List<String> list = new ArrayList<String>();
	    	for(int i = 0; i < begin.length(); i++){
	    		for(char c = 'a'; c <= 'z'; c++){
	    			if(begin.charAt(i) == c) continue;
	    			String newWord = begin.substring(0, i) + c + begin.substring(i + 1);
	    			if(wordList.contains(newWord)){
	    				list.add(newWord);
	    			}
	    		}
	    	}
	    	return list;
	    }*/

}
