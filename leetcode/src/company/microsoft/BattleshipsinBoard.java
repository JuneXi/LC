package company.microsoft;

public class BattleshipsinBoard {
    public int countBattleships(char[][] board) {
        if(board == null || board[0] == null || board.length == 0 || board[0].length == 0){
            return 0;
        }
        int res = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')){
                    res++;
                }
            }
        }
        return res;
        
    }

}
