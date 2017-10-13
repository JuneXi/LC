package dynamicPro;

public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	int[][] res = new int[m][n];
    	//initialize
    	for(int i = 0; i < m; i++){
    		if(obstacleGrid[i][0] == 0){
    			res[i][0] = 1;
    		}	
    		else{
    			break;
    		}
    	}
    	for(int j = 0; j < n; j ++){
    		if(obstacleGrid[0][j] == 0){
    			res[0][j] = 1;
    		}	
    		else{
    			break;
    		}
    	}
    	
    	// find path
    	
    	for(int i = 1; i < m; i++){
    		for(int j = 1; j < n; j++){
    			if(obstacleGrid[i][j] == 1){
    				res[i][j] = 0;
    			}
    			else{
        			res[i][j] = res[i][j - 1] + res[i - 1][j];
        		}
    		}
    		
    	}
    	return res[m - 1][n - 1];
        
    }

}
