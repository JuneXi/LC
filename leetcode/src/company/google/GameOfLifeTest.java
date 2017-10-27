package company.google;

public class GameOfLifeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameOfLife app = new GameOfLife();
		int[][] board = new int[][]{{0,1},{1,1}};
		app.gameOfLife(board);
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				System.out.print(board[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
