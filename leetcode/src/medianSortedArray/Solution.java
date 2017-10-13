package medianSortedArray;

//TODO: time limit exceeded

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        if(length % 2 == 0){
        	return (findKth(nums1, 0, nums2, 0, length/2) + findKth(nums1, 0, nums2, 0, length/2+1))/2.0;// notice 2.0
        }
        else{
        	return findKth(nums1, 0 , nums2, 0, length/2 +1 );
        }
    }
    
    public int findKth( int[] A, int a_start, int[] B, int b_start, int k){
    	
    	//when A is empty
    	if(a_start >= A.length){
    		return B[b_start + k -1];
    	}
    	//when B is empty
    	if(b_start >= B.length){
    		return A[a_start + k -1];
    	}
    	//when k =1
    	if(k == 1){
    		return Math.min(A[a_start], B[b_start]);
    	}
    	
    	
    	int A_key = a_start + k/2 - 1< A.length
    			?A[a_start + k/2 - 1] : Integer.MAX_VALUE;
    	int B_key = b_start + k/2 -1<B.length
    			?B[b_start + k/2 - 1] : Integer.MAX_VALUE;
    			
    	if(A_key < B_key){
    		a_start = a_start + k/2;
    		return findKth(A, a_start, B, b_start, k - k/2);
    	}
    	else{
    		b_start = b_start + k/2;
    		return findKth(A, a_start, B, b_start, k-k/2);
    	}
    	
    }

}
