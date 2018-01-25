package arrays;

import java.util.ArrayList;

public class InsertIntervalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertInterval app = new InsertInterval();
		Interval newInterval = new Interval(2, 5);
		ArrayList<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(6,9));
		app.insert(intervals, newInterval);
		

	}

}
