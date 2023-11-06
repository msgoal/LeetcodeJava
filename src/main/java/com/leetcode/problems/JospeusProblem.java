package com.leetcode.problems;

public class JospeusProblem {
    private int joesphusUsingList(int n, int k){

        return -1;
    }

    private static int joesphus(int n, int k){
        int i=1;
        int res = 0;
        while(i <= n){
            res = (res + k)%i;
            i++;
        }

        return res+1;

        /*if(n == 1)
            return 1;

        return (joesphus(n-1, k) + k - 1) % n + 1;*/
    }
    private static int josephus(int n, int k) {
        return n > 1 ? (josephus(n-1, k) + k - 1) % n + 1 : 1;
    }
    public static void main(String[] args) {

        for(int i=1;i<=20;i++)
        System.out.println(joesphus(i,3));
    }
}
