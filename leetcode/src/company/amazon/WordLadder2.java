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

public class WordLadder2 {
	//so, waste a lot of time !!!!!!!!!!!!!!!!!!
	//only need to change list dict to set dict!!!!!!!!!!!!!!!!!!!!!!!!!
public List<List<String>> findLadders(String beginWord, String endWord, List<String> dict) {
        
    	ArrayList<List<String>> res = new ArrayList<List<String>>();

    	
    	Set<String> wordList = new HashSet<String>();
    	for(String s: dict){
    		wordList.add(s);
    	}
    	
    	if(!wordList.contains(endWord)){
    		return res;
    	}	
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	Map<String, Integer> distance = new HashMap<String, Integer>();
    	wordList.add(beginWord);
    	
    	//use bfs to find distance to begin Word 	
    	bfs(beginWord, distance, wordList, map);
    	
    	ArrayList<String> path = new ArrayList<String>();
    	//ArrayList<List<String>> res = new ArrayList<List<String>>();
    	
    	// use dfs to find all the list and add them into map
    	// start from endWord, if condistion( distance == distance + 1 ), which can ensure we find the shortest path
    	dfs(endWord, beginWord,  path, distance, map, res);
    	
    	return res;
        
    }
    
    private void dfs(String begin, String end, ArrayList<String> path, Map<String, Integer> distance, Map<String, List<String>> map,ArrayList<List<String>> res){
    	path.add(begin);
    	if(begin.equals(end)){
    		Collections.reverse(path);
    		res.add(new ArrayList<String>(path));
    		Collections.reverse(path);
    	}else{
    		for(String s: map.get(begin)){
    			if(distance.containsKey(s) && distance.get(s) == distance.get(begin) - 1){
    				dfs(s, end, path, distance, map, res);
    			}
    		}
    	}
    	path.remove(path.size() - 1);
    }
    
    private void bfs (String begin, Map<String, Integer> distance, Set<String> wordList, Map<String, List<String>> map){
    	Queue<String> q = new LinkedList<String>();
    	q.offer(begin);
    	// bfs no recursion!!!!!!
    	distance.put(begin, 0);
    	for(String s: wordList){
    		map.put(s, new ArrayList<String>());
    	}
    	while(!q.isEmpty()){
    		//get the first string
    		String cur = q.poll();
    		//get the nextWord list
    		List<String> nextWord = getNext(cur, wordList);
    		//for every nextWord, find the distance
    		for(String next : nextWord){
    			map.get(cur).add(next);
    			if(!distance.containsKey(next)){
    				distance.put(next, distance.get(cur) + 1);
    				q.offer(next);
    			}
    		}// got distance
    	}//q is empty
    }
    
    private List<String> getNext(String begin, Set<String> wordList){
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
    }

}
