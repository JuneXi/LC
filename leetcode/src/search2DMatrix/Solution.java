package search2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length == 0 || matrix == null){
    		return false;
    	}
    	//important!!
    	if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
    	
        int row = matrix.length-1;
        int column = matrix[0].length-1;
        
        int m = row;
        int n = 0;
        while(m >=0 && n <= column){
        	if(matrix[m][n]==target){
        		return true;
        	}
        	else if(matrix[m][n] < target){
        		n++;
        	}
        	else{
        		m--;
        	}
        	
        }
        
        return false;
        
        
    }

}
