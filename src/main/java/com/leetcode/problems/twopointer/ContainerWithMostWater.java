package com.leetcode.problems.twopointer;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=-1;
        while(i != j){

            int len = j - i;
            int area = Math.min(height[i],height[j]) * len;

            if(height[i] < height[j])
                i++;
            else
                j--;

            if(max < area)
                max = area;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
