package arrays;

import java.util.ArrayList;
import java.util.List;
/*https://gregable.com/2013/10/majority-vote-algorithm-find-majority.html
*/public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums == null || nums.length == 0){
            return res;
        }
        int count1 = 0;
        int count2 = 0;
        int first = 0, second = 1;
        
        for(int n : nums){
            if(n == first){
                count1++;
            }else if(n == second){
                count2++;
            }else if(count1 == 0){
                first = n;
                count1++;
            }else if(count2 == 0){
                second = n;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int n : nums){
            if(n == first){
                count1++;
            }else if(n == second){
                count2++;
            }
        }
        if(count1 > nums.length / 3){
            res.add(first);
        }
        if(count2 > nums.length / 3){
            res.add(second);
        }
        return res;
        
        
    }

}
