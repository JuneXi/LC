package company.google;

import java.util.HashMap;

/*Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

For example,

Given numerator = 1, denominator = 2, return "0.5".
Given numerator = 2, denominator = 1, return "2".
Given numerator = 2, denominator = 3, return "0.(6)".*/

public class FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
    	if(denominator == 0){
    		return "0";
    	}
    	if(numerator == 0){
            return "0";
        }
    	
    	StringBuilder sb = new StringBuilder();
    	//+ or -
    	sb.append((numerator > 0) ^ (denominator > 0) ? "" : "-");
    	long num = Math.abs(( long ) numerator);
    	long den = Math.abs((long) denominator);
    	//note here
    	sb.append(num / den);
    	num = num % den;
    	if(num == 0){
    		//note: remember toString
    		return sb.toString();
    	}
    	
    	//fractional part
    	sb.append(".");
    	HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    	while(num != 0){
    		map.put(num, sb.length());
    		num = num * 10;
    		sb.append(num / den);
    		num = num % den;
    		
    		Integer remainderIndex = map.get(num);
    		if(remainderIndex != null){
    			sb.insert(remainderIndex, "(");
    			sb.append(")");
    			break;
    		}
    	}
    	return sb.toString();
        
    }

}
