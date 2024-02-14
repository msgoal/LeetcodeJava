package com.java.leetcode.dp;

import com.amazonaws.services.dynamodbv2.xspec.S;

import java.util.stream.IntStream;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        String evenRange,oddRange,longestPalSubstring="";
        for(int i=0;i<s.length();i++){
            evenRange = plaindromeCheck(s,i,i+1);
            oddRange = plaindromeCheck(s,i, i);

            if(longestPalSubstring.length() < evenRange.length())
                longestPalSubstring = evenRange;
            if(longestPalSubstring.length() < oddRange.length())
                longestPalSubstring = oddRange;
        }
        return longestPalSubstring;
    }

    private static String plaindromeCheck(String s, int l, int r){
        int L = l,R = r;
        while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return s.substring(L+1, R);
    }

    public static void main(String[] args) {
        //String s = "ABCDCBE";
        //String s = "daabddfddbegtd";
        String s = "ASD";
        System.out.println(longestPalindrome(s));
    }
}
