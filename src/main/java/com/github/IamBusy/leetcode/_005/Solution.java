package com.github.IamBusy.leetcode._005;

class Solution {
    public String longestPalindrome(String s) {
        return expand(s);

    }

    private String dynamic(String a) {
        boolean[][] map = new boolean[a.length()][a.length()];
        int longestLength = 0;
        int start = 0, end = 0;
        for (int j=0; j<a.length(); j++) {
            for (int i=j; i>=0; i--) {
                if (i == j) {
                    map[i][j] = true;
                } else if (j == i+1) {
                    map[i][j] = (a.charAt(i) == a.charAt(j));
                } else {
                    map[i][j] = map[i+1][j-1] && (a.charAt(i) == a.charAt(j));
                }
                if (map[i][j] && (j - i + 1) > longestLength) {
                    longestLength = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        return a.equals("")? "": a.substring(start, end+1);
    }

    private String expand(String s) {
        int start = 0, end = 0;
        for (int i=0; i<s.length(); i++) {
            int l1 = expandCheck(s, i, i);
            int l2 = expandCheck(s, i, i+1);
            if (l1 * 2 - 1 > end - start + 1) {
                start = i - l1 + 1;
                end = i + l1 - 1;
            }

            if (l2 * 2 > end - start + 1) {
                start = i - l2 + 1;
                end = i + l2;
            }
        }
        return s.equals("")? "": s.substring(start, end+1);
    }

    private int expandCheck(String s, int left, int right) {
        int l = 0;
        while (left >=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            l++;
        }
        return l;
    }

    public static void main(String[] args) {
        String test = "ccc";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(test));
    }
}