package company.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]*/

//note prime number
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	//note: here
    	List<List<String>> res = new ArrayList<List<String>>();
        if(strs == null || strs.length == 0){
        	return res;
        }
        
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(String s : strs){
        	int[] count = new int[26];
        	Arrays.fill(count, 0);
        	char[] a = s.toCharArray();
        	for(char c : a){
        		count[c - 'a']++;
        		
        	}
        	StringBuilder sb = new StringBuilder();
        	for(int i = 0; i < 26; i++){
        		sb.append("#");
        		sb.append(String.valueOf(count[i]));
        	}
        	
        	if(map.containsKey(sb.toString())){
        		map.get(sb.toString()).add(s);
        	}else{
        		map.put(sb.toString(),new ArrayList<String>() );
        		map.get(sb.toString()).add(s);
        	}
        }
        //note: here, how to convert map to list
        return new ArrayList(map.values());
        
    }

}
