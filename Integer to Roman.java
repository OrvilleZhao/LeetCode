/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
*/
class Solution {
    public String intToRoman(int num) {
        StringBuilder builder=new StringBuilder();
    	if(num/1000>0){
    		for(int i=0;i<num/1000;i++)
    			builder.append("M");
    		num=num%1000;
    	}
    	if(num/500>0){
			for(int i=0;i<num/500;i++)
				builder.append("D");
    		num=num%500;
    	}
    	if(num/100>0){
    		if(num/100<=3){
	    		for(int i=0;i<num/100;i++)
	    			builder.append("C");
    		}
    		else{
    			if(builder.lastIndexOf("D")==-1){
	        		builder.append("CD");
    			}else{
    				builder.deleteCharAt(builder.lastIndexOf("D"));
	        		builder.append("CM");
    			}
    		}
    		num=num%100;
    	}
    	if(num/50>0){
    		for(int i=0;i<num/50;i++)
    			builder.append("L");
    		num=num%50;
    	}
    	if(num/10>0){
    		if(num/10<=3){
	    		for(int i=0;i<num/10;i++)
	    			builder.append("X");
    		}
    		else{
    			if(builder.lastIndexOf("L")==-1)
    				builder.append("XL");
    			else{
	    			builder.deleteCharAt(builder.lastIndexOf("L"));
	        		builder.append("XC");
    			}
    		}
    		num=num%10;
    	}
    	if(num/5>0){
    		for(int i=0;i<num/5;i++)
    			builder.append("V");
    		num=num%5;
    	}
    	if(num<=3){
    		for(int i=0;i<num;i++)
    			builder.append("I");
    	}
    	else{
    		if(builder.lastIndexOf("V")==-1)
    			builder.append("IV");
    		else{
	    		builder.deleteCharAt(builder.lastIndexOf("V"));
	    		builder.append("IX");
    		}
    	}
        return builder.toString();
    }
}
