package com.java.leetcode.slidingwindow.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> longestSubString = new HashMap<>();
        Integer longestSubstringSize = Integer.MIN_VALUE;
        int lastIndex = 0, currentIndex = 0;
        Character ch = null;

        while(currentIndex < s.length()){
            ch = s.charAt(currentIndex);
            if(longestSubString.containsKey(ch))
            {
                longestSubstringSize = Math.max(currentIndex - lastIndex, longestSubstringSize);
                lastIndex = Math.max(lastIndex, longestSubString.get(ch) + 1);
                longestSubString.put(ch,currentIndex);
            }
            else {
                longestSubString.put(ch, currentIndex);
            }
            currentIndex++;
        }
        return Math.max(currentIndex - lastIndex, longestSubstringSize);
    }
}
