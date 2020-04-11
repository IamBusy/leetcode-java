package com.github.IamBusy.leetcode._014;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        return divideAndConquer(strs);
    }

    private String vertScan(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strs[0].length(); i++) {
            for (int j=1; j<strs.length; j++) {
                if (! (strs[j].length() > i && strs[j].charAt(i) == strs[0].charAt(i))) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }


    private String divideAndConquer(String[] strs) {
        if (strs.length == 0) return "";
        return lcp(strs, 0, strs.length-1);
    }

    private String lcp(String[] strs, int start, int end) {
        if (start == end) {
            return strs[start];
        } else {
            int mid = (start + end) / 2;
            String left = lcp(strs, start, mid);
            String right = lcp(strs, mid+1, end);
            int minIdx = 0;
            int minLen = Math.min(left.length(), right.length());
            for (minIdx=0; minIdx<minLen; minIdx++) {
                if (left.charAt(minIdx) != right.charAt(minIdx)) {
                    break;
                }
            }
            return left.substring(0, minIdx);
        }
    }

}
