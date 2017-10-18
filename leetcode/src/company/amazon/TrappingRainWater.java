package company.amazon;

/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.*/

public class TrappingRainWater {
    public int trap(int[] height) {
    	if(height.length <=1 || height == null){
    		return 0;
    	}   	
    	int max = 0;
    	int location = 0;
    	int cur = 0;
    	int[] waterLine = new int[height.length];
    	
    	//check from left to right
    	while(cur < height.length - 1){
    		//check units right of current location
    		for( int j = cur + 1; j < height.length; j++){
    			//when we find the first higher bar, we change waterLine from cur to that bar to cur bar value(except the higher bar),then move to next units
    			if(height[j] > height[cur]){
    				waterLine[j] = height[j];
    				for(int z = cur ; z < j; z++){
    					waterLine[z] = height[cur];
    				}
    				cur = j;
    				break;
    			}else{
    				//if we can't find any bar higher than current, we mark the heighest bar of rest
    				if(height[j] >= max){
    					max = height[j];
    					location = j;
    				}
    			}

    		}
    		
    		//no higher bar, change waterLine from cur to highest, reset max & location
    		if(location > cur){
    			waterLine[cur] = height[cur];
			for(int z = cur + 1; z <= location; z++){
				waterLine[z] = height[location];
			}
    		cur = location; 		
    		}
    		max = 0;
    	}//after that, we got the waterLine
    	
    	int sum = 0;
    	for(int i = 0; i < height.length; i++){
    		sum = sum + waterLine[i] - height[i];
    	}
    	return sum;
        
    }

}
