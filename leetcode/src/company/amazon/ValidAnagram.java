package company.amazon;

/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.*/

public class ValidAnagram {
public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
        	return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
        	count[s.charAt(i) - 'a']++;
        	count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
        	if(count[i] != 0){
        		return false;
        	}
        }
        return true;
    }
}
