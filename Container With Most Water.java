/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
*/
class Solution {
    public int maxArea(int[] height) {
        int length=height.length;
    	int left=0;
    	int right=length-1;
    	int leftw=height[left];
    	int rightw=height[right];
    	int maxContent=(right-left)*(leftw<rightw?leftw:rightw);
    	boolean exchange=(leftw<rightw?true:false);
    	while(left<right){
    		if(height[left]<(leftw<rightw?leftw:rightw)){
    			left++;
                exchange=(height[left]<height[right]?true:false);
    			continue;
    		}
    		if(height[right]<(leftw<rightw?leftw:rightw)){
    			right--;
                exchange=(height[left]<height[right]?true:false);
    			continue;
    		}
    		if(exchange){  			
    			int sum=(right-left)*(height[left]<height[right]?height[left]:height[right]);
    			if(sum>maxContent) 
    				maxContent=sum;
    			left++;
    			exchange=(height[left]<height[right]?true:false);
    		}else{
    			int sum=(right-left)*(height[left]<height[right]?height[left]:height[right]);
    			if(sum>maxContent) 
    				maxContent=sum;
    			right--;
    			exchange=(height[left]<height[right]?true:false);
    		}
    	}
        return maxContent;
    }
}
