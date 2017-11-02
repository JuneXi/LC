package easy;

/*Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.*/

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
    	if(n == 0){
    		return 0;
    	}else{
    		return n / 5 + trailingZeroes(n / 5);
    	}
        
    }

}
