/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/
class Solution {
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
    	int sum=numRows+numRows-2;
    	String[] sub=new String[sum];
    	for(int i=0;i<sum;i++) sub[i]="";
    	for(int i=0;i<s.length();i++){
    		sub[i%sum]+=s.charAt(i);
    	}
    	String result="";
    	result+=sub[0];
    	for(int j=1;j<=numRows-2;j++){
    		for(int i=0;i<Math.ceil(s.length()/(sum*1.0));i++){   		
    			if(i<sub[j].length())
    			result+=sub[j].charAt(i);
    			if(i<sub[2*numRows-2-j].length())
    			result+=sub[2*numRows-2-j].charAt(i);
    		}
    	}
    	result+=sub[numRows-1];
        return result;
    }
}
