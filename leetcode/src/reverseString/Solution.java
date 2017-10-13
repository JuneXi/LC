package reverseString;

public class Solution {
    public String reverseString(String s) {
        if(s.length()==0 ||s.equals(null)){
            return "";
        }
        String res = new StringBuilder(s).reverse().toString();
        return res;
        
    }
}

////or s.toCharArray() to transfer to an array
