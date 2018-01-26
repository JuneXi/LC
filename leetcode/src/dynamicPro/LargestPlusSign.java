package dynamicPro;

public class LargestPlusSign {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        
        int[][] dp = new int[N][N];
        //initialize the dp map
        for(int i = 0; i <= N / 2; i++ ){
            for( int j = i; j < N - i; j++){
                dp[i][j] = i + 1;
                dp[j][i] = i + 1;
                dp[N - 1 - i][N - 1 - j] = i + 1;
                dp[N - 1 - j][N - 1 - i] = i + 1;
            }
        }
        
        for( int i = 0; i < mines.length; i++){
            
                int r = mines[i][0];
                int c = mines[i][1];
                dp[r][c] = 0;
                check(dp, r, c, N);
                
                //below code for test
                System.out.print("after we check " + r + " : " + c + " new map as follows : \n");
                for(int z = 0; z < N; z++){
                	for(int l = 0; l < N; l++){
                		System.out.print(dp[z][l] + "\t");
                	}
                	System.out.println("\n");
                }
                
                
            
        }
        
        for(int i = 0; i < N; i++){
        	for(int j = 0; j < N; j++){
        		System.out.print(dp[i][j] + "\t");
        	}
        	System.out.println("\n");
        }
        
        int count = 0;
        for(int[] i : dp){
            for(int n : i)
            count = Math.max(count, n);
        }
        return count;
        
    }
    
    private void check(int[][] dp, int r, int c, int N){
        for(int i = r - 1; i > 0; i--){
            if(dp[i][c] > r - i){
                dp[i][c] = r - i;
            }else{
                break;
            }
        }
        for(int i = r + 1; i < N ; i++){
            if(dp[i][c] > i - r){
                dp[i][c] = i - r;
            }else{
                break;
            }
        }
        for(int i = c - 1; i > 0; i--){
            if(dp[r][i] > c - i){
                dp[r][i] = c - i;
            }else{
                break;
            }
        }
        for(int i = c + 1; i < N; i++){
            if(dp[r][i] > i - c){
                dp[r][i] = i - c;
            }else{
                break;
            }
        }
    }

}
