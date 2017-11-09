package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".*/

public class FindAllAnagramsInString {
	public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(s == null || s.length() == 0){
            return res;
        }
        
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char c: p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
                    
        int begin = 0; int end = 0;
        int counter = p.length();
        char[] s2 = s.toCharArray();
        char[] p2 = p.toCharArray();
                    
        while(end < s.length()){
            if(map.containsKey(s2[end])){
                map.put(s2[end], map.get(s2[end]) - 1);
                if(map.get(s2[end]) >= 0){
                    counter--;
                }
            }
            end++;
            while(counter == 0){
                if(map.containsKey(s2[begin])){
                    map.put(s2[begin], map.get(s2[begin]) + 1);
                    if(map.get(s2[begin]) > 0){
                        counter++;
                    }
                }
                
                if(end - begin == p.length()){
                    res.add(begin);
                }
                begin++;
            }
            
            
        }
        return res;
        
    }

}
