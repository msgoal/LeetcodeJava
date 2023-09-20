package com.leetcode.problems.greedy;

public class WildcardMatching {
    public static boolean isMatch(String s, String p) {
        int pit=0, patternLength=p.length(), sit=0, strLength=s.length();
        while(pit < patternLength && sit < strLength){
            char ch = s.charAt(sit);
            char ph = p.charAt(pit);

            switch(ph){
                case '*':   while(p.charAt(pit) == '*'){pit++;}
                            while(sit < strLength && s.charAt(sit) != p.charAt(pit) && p.charAt(pit) != '?'){sit++;}
                    break;
                case '?':   if(ch!='\0'){
                                sit++;pit++;
                            }else return false;
                    break;
                default :   if(ch == ph){
                                sit++;pit++;
                            }else return false;
                    break;
            }
        }
        if(sit < strLength || pit < patternLength)
            return false;
        return true;
    }

    public static boolean isMatchX(String text, String pattern)
    {
        int n = text.length();
        int m = pattern.length();
        int i = 0, j = 0, startIndex = -1, match = 0;

        while (i < n) {
            // If the current characters match or the
            // pattern has a '?', move to the next
            // characters in both pattern and text.
            if (j < m&& (pattern.charAt(j) == '?'|| pattern.charAt(j)== text.charAt(i))) {
                i++;
                j++;
            }
            // If the pattern has a '*' character, mark the
            // current position in the pattern and the text
            // as a proper match.
            else if (j < m && pattern.charAt(j) == '*') {
                startIndex = j;
                match = i;
                j++;
            }
            // If we have not found any match and no '*' character,
            // backtrack to the last '*' character position
            // and try for a different match.
            else if (startIndex != -1) {
                j = startIndex + 1;
                match++;
                i = match;
            }
            // If none of the above cases comply, the pattern
            // does not match.
            else {
                return false;
            }
        }

        // Consume any remaining '*' characters in the given
        // pattern.
        while (j < m && pattern.charAt(j) == '*') {
            j++;
        }

        // If we have reached the end of both the pattern
        // and the text, the pattern matches the text.
        return j == m;
    }
    public static void main(String[] args) {
        //System.out.println(isMatch("abcd","***abcd"));
        //System.out.println(isMatch("aa","a"));
        //System.out.println(isMatch("cb","?a"));
        System.out.println(isMatchX("baaabab","*****ba*****ab"));
        System.out.println(isMatchX("baaabab","*****ba*****?ab"));
    }
}
/**
 *
 * *****|ba|*****|ab
 *      |ba| aab |ab
 */