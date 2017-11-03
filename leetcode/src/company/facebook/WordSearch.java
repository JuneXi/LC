package company.facebook;

/*Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.*/

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		if(word == null || word.length() == 0){
			return true;
		}
		for(int i = 0; i < board.length ; i++){
			for(int j = 0; j < board[0].length; j ++){
				if(search(board, word, i, j)){
					return true;
				}
			}
		}
		return false;
		
        
    }
	
	//TODO: will be faster if I used an int to locate String instead of substring it ???
	public boolean search(char[][] board, String word, int i, int j){
		if(word.length() == 0){
			return true;
			
		}
		//note:how to handle only one element?? how to handle the boundry
		if(i < 0 || j < 0 || i > board.length - 1|| j > board[0].length - 1 || board[i][j] != word.charAt(0)){
			return false;
		}
		boolean res = true;
		board[i][j] = '#';
		res = search(board,word.substring(1), i - 1, j) || search(board, word.substring(1), i, j - 1)
				|| search(board, word.substring(1), i + 1, j) || search(board, word.substring(1), i, j + 1);
		board[i][j] = word.charAt(0);
		
		//code below worked well except we only have one element in board.
		/*if(board[i][j] == word.charAt(0)){
			//note: remove duplicate
			board[i][j] = '#';
			if(i > 0){
				if(search(board,word.substring(1), i - 1, j)) return true;
			}
			if(j > 0){
				if(search(board, word.substring(1), i, j - 1)) return true;
			}
			if(i < board.length - 1){
				if(search(board, word.substring(1), i + 1, j)) return true;
			}
			//note: here j 
			if(j < board[0].length - 1){
				if(search(board, word.substring(1), i, j + 1)) return true;
			}
			board[i][j] = word.charAt(0);
		
		}*/
		return res;
		
	}

}
