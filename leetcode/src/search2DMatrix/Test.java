package search2DMatrix;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int target = 3;
		boolean res = sol.searchMatrix(matrix, target);
		System.out.print(res);
	}

}
