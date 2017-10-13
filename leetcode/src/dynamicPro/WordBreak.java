package dynamicPro;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] isBreak = new boolean[s.length() + 1];
        isBreak[0] = true;
        
        for(int i = 1; i <= s.length(); i ++){
        	for(int j = 0; j <= i; j++){
        		if(isBreak[j] && wordDict.contains(s.substring(j, i))){
        			isBreak[i] = true;
        			break;
        		}
        	}
        }
        return isBreak[s.length()];
    }
}
