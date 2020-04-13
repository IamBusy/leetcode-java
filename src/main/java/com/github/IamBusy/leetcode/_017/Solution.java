package com.github.IamBusy.leetcode._017;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private char[][] map = new char[][]{
            {'a', 'b', 'c'}, // 2
            {'d', 'e', 'f'}, // 3
            {'g', 'h', 'i'}, // 4
            {'j', 'k', 'l'}, // 5
            {'m', 'n', 'o'}, // 6
            {'p', 'q', 'r', 's'}, // 7
            {'t', 'u', 'v'}, // 8
            {'w', 'x', 'y', 'z'} // 9
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<String>();
        if (digits.length() == 0) return res;
        List<StringBuilder> sbs = new LinkedList<StringBuilder>();
        sbs.add(new StringBuilder());
        for (int i=0; i<digits.length(); i++) {
            int len = sbs.size();
            for (int j=0; j<len; j++) {
                char[] letters = map[digits.charAt(i) - '2'];
                for (int k=1; k<letters.length; k++) {
                    sbs.add((new StringBuilder(sbs.get(j))).append(letters[k]));
                }
                sbs.get(j).append(letters[0]);
            }
        }
        for (StringBuilder sb: sbs) {
            res.add(sb.toString());
        }
        return res;
    }
}
