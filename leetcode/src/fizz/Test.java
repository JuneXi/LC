package fizz;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args){
	Solution sol = new Solution();
	int n = 3;
	ArrayList res = (ArrayList) sol.fizzBuzz(n);
	System.out.println(res.toString());
	}
}
