package company.microsoft;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        //note: here
        int res = dungeon[0][0];
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        
        
        for(int i = 1; i < dungeon.length;i ++){
            dungeon[i][0] += dungeon[i - 1][0];
            res = Math.min(res, dungeon[i][0]);
        }
        for(int j = 1; j < dungeon[0].length; j++){
            dungeon[0][j] += dungeon[0][j - 1];
            res = Math.min(res, dungeon[0][j]);
        }
        for(int i = 1; i < dungeon.length; i++){
            for(int j = 1; j < dungeon[0].length; j++){
                dungeon[i][j] = Math.max(dungeon[i][j] + dungeon[i - 1][j], dungeon[i][j] + dungeon[i][j - 1]);
                res = Math.min(res, dungeon[i][j]);
                
            }
        }
        return (1 - res) <= 0? 1: 1 - res;
        
    }

}
