package company.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*Given two words (beginWord and endWord), and a dictionary's word list, find all *shortest transformation sequence(s) from beginWord to endWord, such that:

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

//最短路径用宽搜！！！dfs智障想哭= =
//TODO: 前面map不用改，把dfs重写bfs就可以了，结合word ladder写！
public class WordLadder2withStep {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    	//important!!
    	ArrayList<List<String>> res = new ArrayList<List<String>>();
    	if(!wordList.contains(endWord)){
    		return res;
    	}
    	
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	Map<String, Integer> distance = new HashMap<String, Integer>();
    	wordList.add(beginWord);
    	wordList.add(endWord);
    	
    	//use bfs to find distance to begin Word 	
    	bfs(beginWord, endWord, distance, wordList, map);
    	
    	
        //for test
        System.out.println("map created as follow");
        for(String word: wordList){
        	System.out.println(word + ":\t");
        	List<String> testNextWord = map.get(word);
        	for(String shuchu: testNextWord){
        		System.out.print(shuchu + "\t");
        	}
        	System.out.println();
        }
        
        
    	ArrayList<String> path = new ArrayList<String>();
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
    
    private void bfs (String begin, String end, Map<String, Integer> distance, List<String> wordList, Map<String, List<String>> map){
    	int min = Integer.MAX_VALUE;
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
    		int step = distance.get(cur) + 1;
    		if(step > min)break;
    		//get the nextWord list
    		List<String> nextWord = getNext(cur, wordList);
    		//for every nextWord, find the distance
    		for(String next : nextWord){
    			map.get(cur).add(next);
    			if(!distance.containsKey(next)){
    				distance.put(next, distance.get(cur) + 1);
    				q.offer(next);
    			}
    			if(next.equals(end)){
    				min = step + 1;
    			}
    		}// got distance
    	}//q is empty
    }
    
    private List<String> getNext(String begin, List<String> wordList){
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
