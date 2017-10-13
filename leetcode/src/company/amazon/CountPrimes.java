package company.amazon;

public class CountPrimes {
    public int countPrimes(int n) {
    	if(n < 2){
    		return 0;
    	}
    	
    	boolean[] isP = new boolean[n];
    	int count = 0;
    	
    	for(int i = 2; i < n; i++){
    		if(isP[i] == false){
    			count++;
    			for(int j = 2; i * j < n; j++){
    				isP[i * j] = true;
    			}
    		}
    	}
    	return count;
        
    }
	
	//³¬Ê±
/*    public int countPrimes(int n) {
        if(n < 3){
        	return 0;
        }
        if(n == 3){
        	return 1;
        }
        int count = 1;
        boolean notP = false;
        for(int i = 3; i < n; i++){
        	for(int j = 2; j <= Math.sqrt(i); j++){
        		if(i%j == 0){
        			notP = true;
        			break;
        		}
        	}
        	if(!notP){
        		count++;
                //System.out.print(i);
        	}else{
                notP = false;
            }
        	
        }
        return count;
    }*/

}
