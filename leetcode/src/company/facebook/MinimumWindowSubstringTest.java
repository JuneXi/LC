package company.facebook;

public class MinimumWindowSubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinimumWindowSubstring app = new MinimumWindowSubstring();
		String s = "bb_";
		String t = "ab";
		
		String res = app.minWindow(s, t);
		System.out.println(res);
	}

}
