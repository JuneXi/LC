package dynamicPro;

import java.util.ArrayList;
import java.util.List;

public class TriangleApp {
	public static void main(String[] angs){
		
		Triangle tri = new Triangle();
		List<List<Integer>> sam = new ArrayList<List<Integer>>();
		List l1 = new ArrayList<Integer>();
		l1.add(-1);
		List l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(3);
		List l3 = new ArrayList<Integer>();
		l3.add(1);
		l3.add(-1);
		l3.add(-3);
		sam.add(l1);
		sam.add(l2);
		sam.add(l3);
		int res = tri.minimumTotal(sam);
		System.out.print(res);
		
	}

}
