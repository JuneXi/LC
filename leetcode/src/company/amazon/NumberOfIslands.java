package company.amazon;
/*Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3*/
public class NumberOfIslands {
	int m;
	int n;
    public int numIslands(char[][] grid) {
    	if(grid == null || grid.length == 0 || grid[0].length == 0){
    		return 0;
    	}
    	 m = grid.length;
    	 n = grid[0].length;
    	int count = 0;
    	for(int i = 0; i < m; i++){
    		for(int j = 0; j < n; j++){
    			if(grid[i][j] == '1'){
    				helper(grid, i, j);
    				count++;
    			}
    		}
    	}
        return count;
    }
    
    private void helper(char[][] grid, int i, int j){
    	if(i < 0 || j < 0 || i > m - 1 || j > n - 1 || grid[i][j] != '1'){
    		return;
    	}
    	grid[i][j] = '0';
    	helper(grid, i - 1, j);
    	helper(grid, i , j - 1);
    	helper(grid, i + 1, j);
    	helper(grid, i , j + 1);
    	
    }

}
