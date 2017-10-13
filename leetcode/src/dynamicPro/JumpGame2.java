package dynamicPro;

/*Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

Note:
You can assume that you can always reach the last index.*/

public class JumpGame2 {
    public int jump(int[] nums) {
    	if(nums.length == 0){
    		return -1;
    	}
        if(nums.length == 1){
            return 0;
        }
    	int start = 0, end = nums[0], jumps = 0;
    	while(end < nums.length){
    		jumps++;
    		int far = end;
    		for(int i = start; i <= end; i++){
    			if(nums[i] + i > far){
    				far = nums[i] + i;
    			}
    		}
    		start = end + 1;
    		end = far;
    	}
    	return jumps;
        
    }

}
