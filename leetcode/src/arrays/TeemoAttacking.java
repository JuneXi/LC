package arrays;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length == 0){
            return 0;
        }
        int end = timeSeries[0] + duration;
        int start = timeSeries[0];
        int time = duration;
        for(int i : timeSeries){
            if(end <= i){
                time += end - start;               
            }else{
                time += i - start;
            }
            start = i;
            end = start + duration;           
        }
        return time;        
    }

}
