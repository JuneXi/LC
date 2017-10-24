package company.google;

/*According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state.*/

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        if(board == null || board[0].length == 0 || board[0] == null || board.length == 0){
        	return;
        }
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		int lives = findLives(board, m, n, i, j);
        		if(board[i][j] == 0 && lives == 3){//00 -> 10
        			board[i][j] = 2;
        		}else if(board[i][j] == 1 && lives >= 2 && lives <= 3){//01 -> 11
        			board[i][j] = 3;
        		}else;
        	}
        }
        
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		board[i][j] = board[i][j] >> 1;
        	}
        }
    }
    
    private int findLives(int[][] board, int m, int n, int i, int j){
    	int lives = 0;
    	//Note: should be m - 1
    	for(int x = Math.max(0, i - 1); x <= Math.min(m - 1, i + 1); x++){
    		for(int y = Math.max(j - 1, 0); y <= Math.min(n - 1, j + 1); y++){
    			if(x == i && y == j)continue;
    			//notice here: priority of & and +!!!
    			lives = lives + (board[x][y] & 1);
    		}
    	}
    	return lives;
    }

}
