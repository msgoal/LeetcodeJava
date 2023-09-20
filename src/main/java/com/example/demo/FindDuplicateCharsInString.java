package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharsInString {
    public static void main(String[] args) {
        String s = "vijay".toLowerCase();

        Set<Character> charSet = new HashSet<>();

        for(int i=0;i<s.length();i++){

            if(charSet.contains(s.charAt(i)))
            {
                System.out.print("Given String contains duplicate chars.");
                return;
            }

            charSet.add(s.charAt(i));
        }

        System.out.println(" String has no Duplicate Chars");
    }
}
