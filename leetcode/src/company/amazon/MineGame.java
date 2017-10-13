package company.amazon;

/*Now given the next click position (row and column indices) among all the unrevealed squares ('M' or 'E'), return the board after revealing this position according to the following rules:

If a mine ('M') is revealed, then the game is over - change it to 'X'.
If an empty square ('E') with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its adjacent unrevealed squares should be revealed recursively.
If an empty square ('E') with at least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.
Return the board when no more squares will be revealed.
Example 1:
Input: 

[['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'M', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E']]

Click : [3,0]

Output: 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]*/

public class MineGame {
    public char[][] updateBoard(char[][] board, int[] click) {
    	if(board == null || board.length == 0 || board[0].length == 0){
    		return board;
    	}
    	
    	int row = click[0];
    	int column = click[1];
    	
    	//if it is Mine
    	if(board[row][column] == 'M'){
    		board[row][column] = 'X';
    		return board;
    	}
    	//if it is Blank
    	if(board[row][column] == 'E'){
    		int count = 0;
    		for(int i = -1; i <= 1; i++){
        		for( int j = -1; j <= 1; j++){
        			if(i + row < 0 || j + column < 0 || i + row >= board.length || j + column >= board[0].length)continue;
        			if(board[i + row][j + column] == 'M' || board[i + row][j + column] == 'X'){
        				count++;
        			}
        		}
        	}
    		//count = findCount(board, row, column);
    		if(count > 0){
    			board[row][column] = (char) (count + '0');
    		}else{
    			board[row][column] = 'B';
    			for(int i = -1; i <= 1; i++){
    	    		for( int j = -1; j <= 1; j++){
    	    			if(i == 0 && j == 0){
    	    				continue;
    	    			}
    	    			//careful here, new r & c
    	    			int r = row + i;
    	    			int c = column + j;
    	    			if(r < 0 || c < 0 || r >= board.length || c >= board[0].length){
    	    				continue;
    	    			}
    	    			if(board[r][c] == 'E'){
    	    				updateBoard(board, new int[] {r, c});
    	    			}
    	    			
    	    		}
    	    	}
    		}
    	}
    	return board;     
    }
 /*   private int findCount(char[][] board, int row, int column){
    	int count = 0;
    	for(int i = -1; i <= 1; i++){
    		for( int j = -1; j <= 1; j++){
    			if(i + row < 0 || j + column < 0 || i + row >= board.length || j + column >= board[0].length)continue;
    			if(board[i + row][j + column] == 'M' || board[i + row][j + column] == 'X'){
    				count++;
    			}
    		}
    	}
    	return count;
    }*/
    
}
