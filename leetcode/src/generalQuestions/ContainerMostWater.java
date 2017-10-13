package generalQuestions;

public class ContainerMostWater {
	   public int maxArea(int[] height) {
	    	if(height.length < 2){
	    		return 0;
	    	}
	        int left = 0;
	        int right = height.length-1;
	        int sum = 0;
	        while(left < right){
	        	sum = Math.max( sum, (right - left) * Math.min(height[left], height[right]));
	        	if( height[left]<height[right]){
	        		left++;
	        	}else{
	        		right--;
	        	}
	        }
	        return sum;
	        
	    }

}
