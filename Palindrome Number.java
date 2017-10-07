/*
Determine whether an integer is a palindrome. Do this without extra space.
*/
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String value=String.valueOf(x);
        int left=0;
        int right=value.length()-1;
        while(left<=right){
        	if(value.charAt(left)!=value.charAt(right))
        		return false;
        	left++;
        	right--;
        }
        return true;
    }
}
