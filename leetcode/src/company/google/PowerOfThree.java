package company.google;

//mi
public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		if(n < 3){
			return false;
		}
        while(n > 2){
        	if(n % 3 != 0){
        		return false;
        	}else{
        		n = n / 3;
        	}
        }
        if(n == 1){
        	return true;
        }else{
        	return false;
        }
    }
	
	//without loop or recursion
	/*public class Solution {
		public boolean isPowerOfThree(int n) {
		    // 1162261467 is 3^19,  3^20 is bigger than int  
		    return ( n>0 &&  1162261467%n==0);
		}*/

}
