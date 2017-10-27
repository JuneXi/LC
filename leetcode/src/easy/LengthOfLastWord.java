package easy;

public class LengthOfLastWord {
	
	   public int lengthOfLastWord(String s) {
	        if(s == null || s.length() == 0){
	        	return 0;
	        }
	        s = s.trim();
	        int lastIndex = s.lastIndexOf(' ') + 1;
	        return s.length() - lastIndex; 
	    }

}
