package com.github.IamBusy.leetcode._009;

public class Solution {

    public boolean isMatch(String s, String p) {
        return isMatchRec(s, p);
    }

    public boolean isMatchRec(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        } else {
            if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
                if (p.length() >= 2 && p.charAt(1) == '*') {
                    return isMatchRec(s, p.substring(2)) ||     // * matches zero
                            // there is no need
                            // isMatchRec(s.substring(1), p.substring(2)) ||   // * matches one
                            isMatchRec(s.substring(1), p);  // * matches at least one
                }
                return isMatchRec(s.substring(1), p.substring(1));
            } else if(p.length() >= 2 && p.charAt(1) == '*') {
                return isMatchRec(s, p.substring(2));
            }
        }
        return false;
    }

}
