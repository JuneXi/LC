package company.facebook;

public class WordSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordSearch app = new WordSearch();
		//char[][] board = {{'a', 'b', 'c','e'},{'s', 'f', 'c', 's'},{'a', 'd', 'e', 'e'}};
		//String word = "abcced";
		//char[][] board = {{'b'},{'a'},{'b'}};
		//String word = "bbabab";
		
		char[][] board = {{'a','b'}};
		String word = "ba";
		boolean res = app.exist(board, word);
		System.out.println(res);
	}

}
