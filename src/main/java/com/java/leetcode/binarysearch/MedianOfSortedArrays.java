package com.java.leetcode.binarysearch;

import java.util.stream.DoubleStream;

public class MedianOfSortedArrays {
    public static double findMedianOfSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length > nums1.length){
            return findMedianOfSortedArrays(nums2, nums1);
        }

        int nums1Length = nums1.length, nums2Length = nums2.length;
        boolean isEven = (nums1Length+nums2Length) % 2 == 0;
        int l = 0, h = nums1.length;
        int px, py;
        while(l <= h){
            px = (l + h)/2;
            py = (nums1Length + nums2Length + 1) / 2 - px;

            int maxLeftX = px == 0 ? Integer.MIN_VALUE : nums1[px - 1];
            int minRightX = px == nums1Length ? Integer.MAX_VALUE : nums1[px];

            int maxLeftY = py == 0 ? Integer.MIN_VALUE : nums2[py - 1];
            int minRightY = py == nums2Length ? Integer.MAX_VALUE : nums2[py];

            if(maxLeftX < minRightY && maxLeftY < minRightX){
                if(isEven)
                    return DoubleStream.of(Math.max(maxLeftX, maxLeftY), Math.min(minRightY,minRightX)).average().getAsDouble();
                else
                    return DoubleStream.of(maxLeftX, maxLeftY).max().getAsDouble();
            }else if(maxLeftX > minRightY){
                h = px - 1;
            }else {
                l = px + 1;
            }
        }
        return 0.0d;
    }

    public static void main(String[] args) {
        //int[] nums1 = {5,7,11,14,18,25,50};
        //int[] nums2 = {2,3,6,12,15,19,31};

        //int[] nums1 = {5,7,11,14,18,25,50};
        //int[] nums2 = {2,3,6,12,15,19,31};

        //int[] nums1 = {1,3};
        //int[] nums2 = {2};

        //int[] nums1 = {1,2};
        //int[] nums2 = {3,4};

        int[] nums1 = {};
        int[] nums2 = {1};

        System.out.println(findMedianOfSortedArrays(nums1, nums2));
    }
}
