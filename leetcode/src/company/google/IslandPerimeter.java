package company.google;

public class IslandPerimeter {
	 public int islandPerimeter(int[][] grid) {
		 if(grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0){
			 return 0;
		 }
		 int count = 0;
	     for(int i = 0; i < grid.length; i++){
	    	 for(int j = 0; j < grid[0].length; j++){
	    		 if(grid[i][j] == 1){
	    			 count = count + 4;
	    			 if(i > 0){
	    				 if(grid[i - 1][j] == 1){
	    					 count = count - 2;
	    				 }
	    			 }
	    			 if(j > 0){
	    				 if(grid[i][j - 1] == 1){
	    					 count = count - 2;
	    				 }
	    			 }
	    		 }
	    	 }
	     }
	     return count;
	 }

}
