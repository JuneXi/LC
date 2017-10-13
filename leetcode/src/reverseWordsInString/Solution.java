package reverseWordsInString;

public class Solution {
    public String reverseWords(String s) {
    	
    	if( s.length() == 0 || s.equals(null)){
    		return "";
    	}
    	//TODO: "" and " "
    	String[] str = s.split(" ");
    	if(str.length!=0){
    	StringBuilder sb = new StringBuilder();
    	for(int i = str.length-1; i >=0; i--){
    		if(!str[i].equals("")){
    		sb.append(str[i]).append(" ");
    		}
    	}
    	
    	return sb.substring(0, sb.length()-1);
    	}
    	else{
    		return "";
    	}
        
    }

}
