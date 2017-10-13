package dynamicPro;

public class EditDistance {
    public int minDistance(String word1, String word2) {
    	if(word1.length() == 0){
    		return word2.length();
    	}
    	if(word2.length() == 0){
    		return word1.length();
    	}
    	int n = word1.length();
    	int m = word2.length();
        int[][] distance = new int[n + 1][m + 1];
        // note all the n, n + 1, m, m + 1
        for(int i = 0; i < n + 1 ;i++){
        	distance[i][0] = i;
        }
        for(int i = 0; i < m + 1 ; i++){
        	distance[0][i] = i;
        }
        
        for(int i = 1; i < n + 1; i++){
        	for ( int j = 1; j < m + 1; j++){
        		if(word1.charAt(i - 1) == word2.charAt(j -1)){
        			distance[i][j] = distance[i - 1][j - 1];
        		}
        		else{
        			distance[i][j] = Math.min(distance[i - 1][j - 1], Math.min(distance[i - 1][j], distance[i][j - 1])) + 1;
        		}
        	}
        }
        return distance[n][m];
    }

}
