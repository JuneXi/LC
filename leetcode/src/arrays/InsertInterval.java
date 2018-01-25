package arrays;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	 public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
	        if (newInterval == null || intervals == null) {
	            return intervals;
	        }

	        List<Interval> results = new ArrayList<Interval>();
	        int insertPos = 0;

	        for (Interval interval : intervals) {
	            if (interval.end < newInterval.start) {
	                results.add(interval);
	                insertPos++;
	            } else if (interval.start > newInterval.end) {
	                results.add(interval);
	            } else {
	                newInterval.start = Math.min(interval.start, newInterval.start);
	                newInterval.end = Math.max(interval.end, newInterval.end);
	            }
	        }

	        results.add(insertPos, newInterval);

	        return results;
	    }

}
