package com.github.IamBusy.leetcode._006;

public class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<numRows; i++) {
            for (int j = i; j<s.length(); j+=numRows*2 - 2) {
                sb.append(s.charAt(j));
                if (i > 0 && i< numRows-1 && j + 2*(numRows - (i + 1)) < s.length()) {
                    sb.append(s.charAt(j + 2*(numRows - (i + 1))));
                }
            }
        }
        return sb.toString();
    }

}

