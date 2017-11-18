package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstructionbyHeight {
	public int[][] reconstructQueue(int[][] people) {
        if(people == null || people.length == 0 || people[0] == null || people[0].length == 0){
            return new int[][] {};
        }
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]){
                    return b[1] - a[1];
                }else{
                    return a[0] - b[0];
                }
            }
        });
        
        ArrayList<int[]> res = new ArrayList<>();
        for(int i = people.length; i > 0; i--){
        	res.add(people[i][1], new int[]{people[i][0], people[i][1]});
        }
        int[][] result = new int[people.length][2];
        int i = 0;
        for(int[] a : res){
        	result[i][0] = a[0];
        	result[i ++][1] = a[1];
        }
        return result;
        
    } 

}
