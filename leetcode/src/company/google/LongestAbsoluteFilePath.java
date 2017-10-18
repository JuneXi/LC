package company.google;

import java.util.ArrayList;

public class LongestAbsoluteFilePath {
	public int lengthLongestPath(String input) {
    if(input == null || input.length() == 0){
    	return 0;
    }
    String[] split = input.split("\n");
    //store the parent level total length
    int[] length = new int[split.length + 1];
    int maxL = 0;
    for(String s : split){
    	//find the last location of "\t"
    	int level = s.lastIndexOf("\t") + 1;
    	//eg:dir  
    	//level = 0
    	//length[1] = length[0] + 3 - 0 + 1= 4
    	//Note: new length must overwrite old length
    	
    	length[level + 1] = length[level] + s.length() - level + 1;//remove "\t" add"\" at last
    	int curL = length[level + 1];
    	if(s.contains(".")){
    		//because we add a "\" at last, now we have to delete it
    		maxL = Math.max(maxL, curL - 1);
    	}
    }
    return maxL;
    }
}
