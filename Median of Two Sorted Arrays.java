/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       	int left1=0,left2=0;
		int posl=0,posr=0;
		int[] nums=new int[nums1.length+nums2.length];
		if((nums1.length+nums2.length)%2==0){
			posl=(nums1.length+nums2.length)/2-1;
			posr=(nums1.length+nums2.length)/2;
		}else{
			posl=(nums1.length+nums2.length)/2;
			posr=(nums1.length+nums2.length)/2;
		}
		int count=0;
		while(left1<nums1.length&&left2<nums2.length){
			if(nums1[left1]<nums2[left2])
				nums[count++]=nums1[left1++];
			else
				nums[count++]=nums2[left2++];
		}
		while(left1<nums1.length){
			nums[count++]=nums1[left1++];
		}
		while(left2<nums2.length){
			nums[count++]=nums2[left2++];
		}
		return (nums[posl]+nums[posr])/2.0; 
    }
}
