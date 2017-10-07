/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/
class Solution {
    public int reverse(int x) {
        boolean posOrneg=true;
    	if(x<0){
    		x=(-x);
    		posOrneg=false;
    	}
    	char[] reverse=(x+"").toCharArray();
    	int left=0;
    	int right=reverse.length-1;
    	while(left<=right){
    		char swap=reverse[right];
    		reverse[right]=reverse[left];
    		reverse[left]=swap;
    		left++;
    		right--;
    	}
    	String result="";
    	for(int i=0;i<reverse.length;i++) {result+=reverse[i];}
    	int index=0;
    	while(index<result.length()&&result.charAt(index)=='0') index++;
    	if(index<result.length())
    	result=result.substring(index);
    	try{
    		if(posOrneg)
    			return Integer.parseInt(result);
    		else
    			return -Integer.parseInt(result);
    	}catch(Exception ex){
    		return 0;
    	}
    }
}
