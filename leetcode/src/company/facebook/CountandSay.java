package company.facebook;

/*The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.*/

public class CountandSay {
	public String countAndSay(int n) {
		if(n < 1){
			return "";
		}
		if(n == 1){
			return "1";
		}
		String s = "1";
		//note: count
		while(-- n > 0){
			StringBuilder sb = new StringBuilder();
			char[] chars = s.toCharArray();
			
			for(int i = 0; i < chars.length; i++){
				//note: =1
				int count = 1;
				while((i + 1) < chars.length && chars[i] == chars[i + 1]){
					count ++;
					i ++;
				}
				sb.append(String.valueOf(count) + String.valueOf(chars[i]));
			}
			s = sb.toString();
		}
		return s;
        
    }

}
