package company.amazon;

public class MineGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MineGame mg = new MineGame();
		char[][] board = new char[][]{{'E','E','E','E','E'},{'E','E','M','E','E'},{'E','E','E','E','E'},{'E','E','E','E','E'}};
		int[] click = new int[] {3,0};
		
		board = mg.updateBoard(board, click);
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				System.out.println(board[i][j]);
			}
			//System.out.println("\n");
		}
	}

}
