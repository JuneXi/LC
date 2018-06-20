package dynamicPro;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if ( nums == null || nums.length == 0){
            return 0;
        }
        
        //initialize the count of all nums
        int[] count = new int[10001];
        for(int i : nums){
            count[i]++;
        }
        
        
        //note: why -1 ? why not 0?
        int pre = -1;
        int used = 0;
        int avoid = 0;
        
        for(int i = 0; i <= 10000; i++){
            if(count[i] > 0){
                if(pre == i - 1){
                    avoid = used;
                    used = Math.max(avoid + count[i] * i, used);
                }else{
                    avoid = Math.max(used, avoid);
                    used = avoid + count[i] * i;
                }
                pre = i;
            }
        }
        return Math.max(avoid, used);
        
    }

}
