/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
/*Solution1*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
       char[] charlists=s.toCharArray();
    	int[] sort=new int[charlists.length];
        for(int i=0;i<charlists.length;i++){
       		sort[i]=i;
       		int j=0;
       		for(j=i-1;j>=0&&charlists[j]!=charlists[i];j--){}
       		if(j>=0&&charlists[j]==charlists[i]) sort[j]=i;
        }   
        int max=0;
        int count=0;
        for(int i=0;i<sort.length;i++){
        	if(sort[i]!=i){
        		int space=sort[i];
        		boolean key=true;
        		count++;
        		for(int j=i+1;j<=space;j++){
        			if(sort[j]!=j&&sort[j]<space){
        					i=j-1;
        					key=false;
        					break;
        			}
        			if(j<space) count++;
        		}
        		if(key){
        			int lenth=sort[i]-i;
        			if(lenth>max)
        				max=lenth;
        			if(count >max){
        				max=count;
        			}
    				count=0;
        		}
        	}else{
        		count++;
        	}
        }
        if(max<count)
        	max=count;      	
        return max;
    }
}
/*Solution2*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
          char[] charlists=s.toCharArray();
    	int[] sort=new int[charlists.length];
        for(int i=0;i<charlists.length;i++){
       		sort[i]=i;
       		int j=0;
       		for(j=i-1;j>=0&&charlists[j]!=charlists[i];j--){}
       		if(j>=0&&charlists[j]==charlists[i]) sort[j]=i;
        }   
        int max=0;
        int count=0;
        for(int i=0;i<sort.length;i++){
        	if(sort[i]==i) count++;
        	else
        	{	
        		int left=i,right=sort[i];
        		while(true){
        			boolean change=false;
		    		for(int j=left+1;j<right;j++){
						if(sort[j]!=j){						
							if(sort[j]<right){
								right=sort[j];
								left=j;
								change=true;
								break;
							}
						}
		    		}
		    		if(!change) break;
        		}
        		count+=right-i;
        		if(count>max){
        			max=count;
        		}
        		count=0;
        		i=left;
        	}   		
        }
        if(count>max)
        	max=count;
       return max;
    }
}
