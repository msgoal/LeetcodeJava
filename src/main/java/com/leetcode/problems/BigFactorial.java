package com.leetcode.problems;

import java.math.BigInteger;

public class BigFactorial {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;

        for(int i = 1;i <= 200; i++){
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println(result);
    }
}
