package company.amazon;

/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.*/

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
    	if(s == null || s.length() == 0){
    		return -1;
    	}
    	
    	int[] count = new int[26];
    	for(int i = 0; i < s.length(); i++){
    		count[s.charAt(i) - 'a']++;
    	}
    	
    	for(int i = 0; i < s.length(); i++){
    		if(count[s.charAt(i) - 'a'] == 1){
    			return i;
    		}
    	}
    	return -1;
        
    }

}
