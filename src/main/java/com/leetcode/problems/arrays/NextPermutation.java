package com.leetcode.problems.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void reverse(int[] nums, int begIndex){
        int m = nums.length-1;
        while(m >= begIndex){
            swap(nums,begIndex++,m--);
        }
    }

    public static void swap(int[] nums, int i, int indx){
        int t = nums[i];
        nums[i] = nums[indx];
        nums[indx] = t;
    }

    public static void nextPermutation(int[] nums) {
        if(nums.length == 1)
            return;

        int i = nums.length - 2;
        while(i > 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        int indx = nums.length - 1;
        while(indx > 0 && nums[i] >= nums[indx])
        {
            indx--;
        }

        swap(nums, i, indx);
        reverse(nums, (i != indx)? i+1 : i);
    }

    public static void main(String[] args) {
        int[] inp = new int[]{1,5,8,4,7,6,5,3};
        nextPermutation(inp);
        Arrays.stream(inp).forEach(x -> System.out.print(" "+x));
        System.out.println();

        /*inp = new int[]{5,4,3,2,1};
        nextPermutation(inp);
        Arrays.stream(inp).forEach(x -> System.out.print(" "+x));
        System.out.println();

        inp = new int[]{1,2};
        nextPermutation(inp);
        Arrays.stream(inp).forEach(x -> System.out.print(" "+x));
        System.out.println();

        inp = new int[]{1,5,1};
        nextPermutation(inp);
        Arrays.stream(inp).forEach(x -> System.out.print(" "+x));
        System.out.println();

        inp = new int[]{5,1,1};
        nextPermutation(inp);
        Arrays.stream(inp).forEach(x -> System.out.print(" "+x));
        System.out.println();*/

    }
}
