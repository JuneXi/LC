package company.google;

import java.util.ArrayList;
import java.util.List;

/*Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].*/

public class SpiralMatrix {
	
	 public List<Integer> spiralOrder(int[][] matrix) {
		 List<Integer> res = new ArrayList<Integer>();
		 if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
			 return res;
		 }
		 
		 int up = 0;
		 int down = matrix.length - 1;
		 int left = 0;
		 int right = matrix[0].length - 1;
	     while( up <= down && left <= right){
	    	 //to right
	    	 for(int j = left; j <= right; j++){
	    		 res.add(matrix[up][j]);
	    	 }
	    	 up++;
	    	 // got down
	    	 for(int i = up; i <= down; i++){
	    		 res.add(matrix[i][right]);
	    	 }
	    	 right--;
	    	 
	    	 //go left
	    	 if(up <= down){
	    	 for(int j = right; j >= left; j--){
	    		 res.add(matrix[down][j]);
	    	 }
	    	 }
	    	 down--;
	    	 
	    	 //go up
	    	 if(left <= right){
	    	 for(int i = down; i >= up; i--){
	    		 res.add(matrix[i][left]);
	    	 }}
	    	 left++;
	    	 
	    	 
	     }
	     return res;
	 }

}
