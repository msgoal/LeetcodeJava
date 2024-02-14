package com.java.leetcode.math;

public class ReverseInteger {
    public static int reverse(int x) {
        long res = 0;
        int rem = 0;
        while( x != 0){
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (int)((res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)? 0 : res);
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
