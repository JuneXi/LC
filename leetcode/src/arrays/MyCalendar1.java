package arrays;

import java.util.TreeMap;

public class MyCalendar1 {
	
	TreeMap<Integer, Integer> calendar;
	
	public MyCalendar1() {
        calendar = new TreeMap();
    }
    
    public boolean book(int start, int end) {
        if((calendar.ceilingKey(start) == null || calendar.ceilingKey(start) <= end)&& (calendar.floorKey(start) == null || calendar.floorEntry(start).getValue() <= start)){
        	calendar.put(start, end);
        	return true;
        }
        return false;
        
    }

}
