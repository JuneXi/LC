package company.facebook;

import java.util.Arrays;

/*Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

For example, given the following matrix:

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
Return 6.*/

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
    	if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
    		return 0;
    	}
    	int m = matrix.length;
    	int n = matrix[0].length;
    	int[] left = new int[n];
    	int[] right = new int[n];
    	int[] up = new int[n];
    	Arrays.fill(right, n);
    	int res = 0;
    	for(int i=0; i<m; i++) {
            int cur_left=0, cur_right=n; 
            for(int j=0; j<n; j++) { // compute height (can do this from either side)
                if(matrix[i][j]=='1'){
                	up[j]++;
                }
                else {
                	up[j]=0;
                }
            }
            for(int j = 0; j < n; j++) { // compute left (from left to right)
                if(matrix[i][j]=='1') left[j]=Math.max(left[j],cur_left);
                else {
                	left[j] = 0; 
                	cur_left = j + 1;
                	}
            }
            // compute right (from right to left)
            for(int j = n - 1; j >= 0; j--) {
                if(matrix[i][j] == '1'){
                	right[j] = Math.min(right[j], cur_right);
                }
                else {
                	right[j] = n; 
                	cur_right = j;
                	}    
            }
            // compute the area of rectangle (can do this from either side)
            for(int j = 0; j < n; j++)
                res = Math.max(res,(right[j] - left[j]) * up[j]);
        }
    	
 
        return res;
    }
}
