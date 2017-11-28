
package company.amazon;

import java.util.ArrayDeque;
import java.util.Deque;

/*Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

For example,
Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Therefore, return the max sliding window as [3,3,5,5,6,7].*/


//TODO: nothing to say, just remember that!!!!
public class SlidingWindowMaximum {
	//note: Deque to modify first and last
	// draw 
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        //initialize
        for(int i = 0; i < k - 1; i++){
            inQueue(dq, nums[i]);
        }
        for(int i = k - 1; i < nums.length; i++){
            inQueue(dq, nums[i]);
            res[i - k + 1] = dq.peekFirst();
            outQueue(dq, nums[i - k + 1]);
        }
        return res;
        
    }
    private void inQueue(Deque<Integer> dq, int n){
        while(!dq.isEmpty() && dq.peekLast() < n){
            dq.pollLast();
        }
        dq.offer(n);
    }
    
    private void outQueue(Deque<Integer> dq, int n){
        if(dq.peekFirst() == n){
            dq.pollFirst();
        }
    }
}
