package com.leetcode.problems.dp;

import java.util.Arrays;
import java.util.Map;

public class DPFibnocci {
    private static int fib(int n, int[] map){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(map[n] != 0)
            return map[n];

        map[n] = fib(n-1,map) + fib(n-2, map);
        return map[n];
    }
    public static void main(String[] args) {

        int n = 10;
        int[] map = new int[n];
        map[0]=0;
        map[1]=1;

        System.out.println(fib(n-1, map));
        System.out.println();
        Arrays.stream(map).forEach(x -> System.out.print(x+", "));
    }
}
