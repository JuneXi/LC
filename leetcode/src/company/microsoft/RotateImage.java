package company.microsoft;

public class RotateImage {
	public void rotate(int[][] matrix) {
        if(matrix == null || matrix[0] == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        int m = matrix.length - 1;
        for(int i = 0; i < matrix.length / 2; i++){
            for(int j = 0; j < (m + 2) / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m - j][i];
                matrix[m - j][i] = matrix[m - i][m - j];
                matrix[m - i][m - j] = matrix[j][m - i];
                matrix[j][m - i] = temp;
            }
        }
        
    }

}
