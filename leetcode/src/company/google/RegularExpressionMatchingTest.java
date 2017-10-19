package company.google;

public class RegularExpressionMatchingTest {
	public static void main(String[] args){

	RegularExpresssionMatching app = new RegularExpresssionMatching();
	String s = "aa";
	String p = ".*";
	boolean res = app.isMatch(s, p);
	System.out.println(res);
	}
}
