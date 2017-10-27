package company.google;

import java.util.ArrayList;
import java.util.List;


public class TheSkyLineProblem2 {
    public List<int[]> getSkyline(int[][] buildings) {
    	ArrayList<int[]> res = new ArrayList<int[]>();
    	if(buildings == null || buildings.length == 0 || buildings[0] == null || buildings[0].length == 0){
    		return res;
    	}
    	int size = 0;
    	for(int i = 0; i < buildings.length; i++){
    		if(buildings[i][1] > size){
    			size = buildings[i][1];
    		}
    	}
        int[] map = new int[size + 1];
    	
    	for(int i = 0; i < buildings.length;i++){
    		for(int j = buildings[i][0]; j<= buildings[i][1]; j++){
    			map[j] = Math.max(buildings[i][2], map[j]);
    		}
    	}
    	int cur = 0;
    	
    	for(int i = 0; i <=size; i++){
    		if(map[i] > cur){
    			cur = map[i];
    			res.add(new int[] {i,cur});
    		}else if(map[i] < cur){
    			cur = map[i];
    			res.add(new int[] {i - 1, cur});
    		}else;
    	}
    	res.add(new int[] {size, 0});
    	return res;
    }

}
