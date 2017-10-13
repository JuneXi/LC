package company.amazon;

import java.util.ArrayList;
import java.util.Vector;

/*Given an index k, return the kth row of the Pascal's triangle.
1
11
121
1331
For example, given k = 3,
Return [1,3,3,1].*/

public class ParscalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 1){
        	return null;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i++){
        	ArrayList<Integer> res = new ArrayList<Integer>();
        	res.set(0, 1);
        	
        	}
        }
    }

}
