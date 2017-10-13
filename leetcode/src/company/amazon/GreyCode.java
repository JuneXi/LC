package company.amazon;

import java.util.LinkedList;
import java.util.List;

/*The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2*/

public class GreyCode {
    public List<Integer> grayCode(int n) {
    	List<Integer> result = new LinkedList<>();
    	//TODO: what this?
    	for(int i = 0; i < 1<<n; i++){
    		result.add(i ^ i>>1);
    	}
        return result;
    }

}
