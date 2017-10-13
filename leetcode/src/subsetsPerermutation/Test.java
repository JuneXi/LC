package subsetsPerermutation;

import java.util.ArrayList;

public class Test {
	public static void main( String[] ars){
		Solution sol = new Solution();
		int[] S = {1,2,3,4};
		ArrayList<ArrayList<Integer>> res1 = sol.subsets(S);
//		Solution2 sol2 = new Solution2();
//		ArrayList<ArrayList<Integer>> res2 = sol2.subsets(S);
		System.out.println(res1);
//		System.out.println(res2);
		
	}

}
