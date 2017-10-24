package company.google;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindAllNumbersDisappeared app = new FindAllNumbersDisappeared();
		int[] nums = {4,3,2,7,8,2,3,1};
		List res = app.findDisappearedNumbers(nums);
		//for(int i = 0; i < res.size(); i ++){
			System.out.print(res.toArray().toString());
		//}
	}

}
