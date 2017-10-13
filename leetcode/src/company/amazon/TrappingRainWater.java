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
    	while(cur < height.length - 1){
    		for( int j = cur + 1; j < height.length; j++){
    			if(height[j] > height[cur]){
    				waterLine[j] = height[j];
    				for(int z = cur ; z < j; z++){
    					waterLine[z] = height[cur];
    				}
    				cur = j;
    				break;
    			}else{
    				if(height[j] >= max){
    					max = height[j];
    					location = j;
    				}
    			}

    		}
    		if(location > cur){
    			waterLine[cur] = height[cur];
			for(int z = cur + 1; z <= location; z++){
				waterLine[z] = height[location];
			}
    		cur = location; 		
    		}
    		max = 0;
    	}
    	
    	int sum = 0;
    	for(int i = 0; i < height.length; i++){
    		sum = sum + waterLine[i] - height[i];
    	}
    	return sum;
        
    }

}
