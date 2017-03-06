package com.sunny;

public class MedianOfTwoSortedArrays_04 {
public static void main(String[] args) {
	int [] nums1 = {1};
	int [] nums2 = {};
	System.out.println(findMedianSortedArrays(nums1,nums2));
}

public static double findMedianSortedArrays(int[] nums1, int[] nums2) {{
	int i = 0, j = 0;
	double re = 0;
	int median = ((nums1.length+nums2.length)/2)-1;
    while(median>0)	
    {
    	if(nums1[i]>nums2[j]){j++;}
    	else{i++;}
    	median--;
    }
    re = nums1[i]>nums2[j]?nums2[j++]:nums1[i++];
    if((i+j)%2==0 && nums1.length+nums2.length!=1){re+=!(nums1[i%nums1.length]>nums2[j%nums2.length])?nums2[j]:nums1[i];re = re/2;}
    return re;
}}
}

//
