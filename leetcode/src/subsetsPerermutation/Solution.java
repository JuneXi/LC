package subsetsPerermutation;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer>> subsets(int[] S){
		//funny thing is you must use ArrayList<List<Integer>> if the return type is List<List<Integer>>
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int pos = 0;
		searchsub(result, list, pos, S);
		return result;
	}
	
	
	public void searchsub(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int pos, int[]S){
		//must new a ArrayList
		result.add(new ArrayList<Integer>(list));
		// i !=0
		for(int i = pos; i < S.length; i++){
			list.add(S[i]);
			searchsub(result, list, i + 1, S);
			list.remove(list.size()-1);
		}
	}

}
