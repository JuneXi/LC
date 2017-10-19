package company.google;

import java.util.ArrayList;
import java.util.List;

/*Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].*/

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<Interval>();
		if(intervals == null || intervals.size() <= 1){
			return intervals;
		}
	
        //sort by the start value
		intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		//merge
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(Interval item: intervals){
			//3 case
			// (1,4)(5,7)
			// (1,4)(3,7)
			// (1,4)(3,4)
			if(item.start <= max){
				res.remove(res.size() - 1);
				//note: here!
				max = Math.max(max, item.end);
				res.add(new Interval(min, max));
			}else if(item.end <= max){
				
			}else{
				min = item.start;
				max = item.end;
				res.add(new Interval(min, max));
			}
			
		}
		return res;
    }

}
