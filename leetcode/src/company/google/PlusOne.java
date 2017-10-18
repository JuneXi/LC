package company.google;

/*Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.*/

public class PlusOne {
public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
        	return digits;
        }
        int mark = 1;
        for( int i = digits.length - 1; i >= 0; i--){
        	if(mark == 0){
        		break;
        	}else{
        		digits[i] = digits[i] + mark;
        		if(digits[i] == 10){
        			digits[i] = 0;
        			mark = 1;
        		}else{
        			mark = 0;
        		}
        	}
        }
        if(mark == 0){
        	return digits;
        }else{
        	int[] res = new int[digits.length + 1];
        	res[0] = 1;
        	for(int i = 0; i < digits.length; i++){
        		res[i + 1] = digits[i];
        	}
        	return res;
        }
    }

}
