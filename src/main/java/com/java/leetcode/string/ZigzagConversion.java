package com.java.leetcode.string;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        int j,inc = 2 * numRows - 2,mid=0;
        StringBuffer builder = new StringBuffer(s.length());
        for(int i=0;i<numRows;i++){
            j = i;
            while(j < s.length()){
                builder.append(s.charAt(j));
                j += inc;
                mid = j-(2*i);
                if(i > 0 && i < numRows-1 && mid < s.length())
                    builder.append(s.charAt(mid));
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {

        System.out.println(convert("PAYPALISHIRING",3));
    }
}
