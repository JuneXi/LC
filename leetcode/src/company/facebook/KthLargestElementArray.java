package company.facebook;

/*Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note: 
You may assume k is always valid, 1 ¡Ü k ¡Ü array's length.
*/
public class KthLargestElementArray {
    public int findKthLargest(int[] nums, int k) {
        if( nums == null || nums.length == 0){
            return 0;
        }
        
        k = nums.length - k;
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high){
            int j = findHelper(nums, low, high);
            if(j < k){
                low = j + 1;
            }else if (j > k){
                high = j - 1 ;
            }else{
                break;
            }
        }
        return nums[k];
        
        
    }
    
    private int findHelper(int[] nums, int low, int high){
        int i = low;
        int j = high + 1;
        while(true){
            while(i < high && less(nums[++ i], nums[low]));
            while(j > low && less(nums[low], nums[--j]));
            if(i >= j){
                break;
            }
            swap(nums, i ,j);
        }
        swap(nums, low ,j);
        return j;
        
    }
    
    private boolean less(int i, int j){
        return (i < j);
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
