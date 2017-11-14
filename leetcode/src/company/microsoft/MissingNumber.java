package company.microsoft;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        int l = nums.length;
        return l * (l + 1) /2 - sum;
        
    }

}
