package com.github.IamBusy.leetcode._010;

public class Solution {
    private int[][] map;

    public boolean isMatch(String s, String p) {
        map = new int[s.length()][p.length()];
        return isMatchDynamic(s, p);
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

    public boolean isMatchRecOpt(String s, String p, int i, int j) {
        return false;
    }

    public boolean isMatchDynamic(String s, String p) {
        boolean[][] map = new boolean[s.length()+1][p.length()+1];
        map[0][0] = true;
        for (int i=0; i<=s.length(); i++) {
            if (i > 0) {
                for (int j=1; j<=p.length(); j++) {
                    if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.') {
                        map[i][j] = map[i-1][j-1];
                    } else if(p.charAt(j-1) == '*') {
                        if (j >= 2) {
                            map[i][j] = map[i][j-2]; // match zero element
                            int cur = i-1;
                            while (!map[i][j] && (cur == 0) || (cur > 0 && (s.charAt(cur-1) == p.charAt(j-2) || p.charAt(j-2) == '.'))) {
                                map[i][j] = map[i][j] || map[cur][j-2];
                                cur--;
                            }
                            // map[i][j] = map[i][j-2] || map[i-1][j-2];
                        }

                    }
                }

            } else {
                for (int j=1; j<=p.length(); j++) {
                    if (p.charAt(j-1) == '*' && j >= 2) {
                        map[i][j] = map[i][j-2];
                    }
                }
            }

        }
        return map[s.length()][p.length()];
    }

}
