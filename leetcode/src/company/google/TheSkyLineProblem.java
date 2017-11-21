package company.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//https://briangordon.github.io/2014/08/the-skyline-problem.html
//check the link above with details
public class TheSkyLineProblem {
    public List<int[]> getSkyline(int[][] buildings) {
    	ArrayList<int[]> res = new ArrayList<int[]>();
    	if(buildings == null || buildings.length == 0 || buildings[0] == null || buildings[0].length == 0){
    		return res;
    	}
    	List<int[]> height = new ArrayList<>();
    	for(int i = 0; i < buildings.length; i++){
    		height.add(new int[] {buildings[i][0], -buildings[i][2]});
    		height.add(new int[] {buildings[i][1], buildings[i][2]});   		
    	}

    	Collections.sort(height, new Comparator<int[]>(){
    		public int compare(int[]h1,int[] h2){
    			if(h1[0] != h2[0]){
    				return h1[0] - h2[0];
    			}else{
    				return h1[1] - h2[1];
    			}
    		}
    	});
    	//note: comparator here
    	Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
    	//note: why offer 0?
    	pq.offer(0);
    	int cur = 0;
    	for(int[] a : height){
    		if(a[1] < 0){
    			pq.add(-a[1]);
    		}else{
    			pq.remove(a[1]);
    		}
    		int line = pq.peek();
    		if(line != cur){
    			res.add(new int[]{a[0], line});
    			cur = line;
    		}
    	}
    	
    	return res;
    }

}
