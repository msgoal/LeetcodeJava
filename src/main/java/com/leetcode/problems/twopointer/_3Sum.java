package com.leetcode.problems.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalResult = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1,u = nums.length-1,s;
            while(l < u){
                s = nums[i]+nums[l]+nums[u];
                if(s > 0){
                    u--;
                }else if(s < 0){
                    l++;
                }
                else{
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[u]);
                    finalResult.add(list);
                    while(l < u && nums[l] == nums[l+1])l++;
                    while(l < u && nums[u] == nums[u-1])u--;
                    l++;
                }
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        //System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(threeSum(new int[]{0,0,0,0}));
    }
}
