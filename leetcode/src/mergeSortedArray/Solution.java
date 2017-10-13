package mergeSortedArray;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	if(nums2.length != 0){
        int i = m - 1;
        int j = n -1;
        int cur = m + n-1;
        while(i>0 && j>0){
        	if (nums1[i] > nums2[j]){
        		nums1[cur--] = nums1[i];
        		i--;
        	}
        	else{
        		nums1[cur--] = nums2[j];
        		j--;
        	}
        }
        while(i>0){
        	nums1[cur--] = nums1[i--];
        }
        while(j>0){
        	nums1[cur--] = nums2[j];
        }
    }
    }

}
