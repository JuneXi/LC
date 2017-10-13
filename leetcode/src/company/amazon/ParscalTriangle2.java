package company.amazon;


/*Given an index k, return the kth row of the Pascal's triangle.
1
11
121
1331
For example, given k = 3,
Return [1,3,3,1].*/

public class ParscalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0){
        	return null;
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i++){
        	res.add(1);
        	
        	//TODO: why??? 
        	for(int j = i - 1; j > 0; j--){
        		res.set(j, res.get(j - 1) + res.get(j));
        	}
        }
        return res;
    }

}
