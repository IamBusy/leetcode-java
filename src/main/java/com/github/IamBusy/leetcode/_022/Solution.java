package com.github.IamBusy.leetcode._022;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<String>();
        backtrace(res, "", 0, 0, n);
        return res;
    }

    public void backtrace(List<String> res, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            res.add(cur);
            return;
        }
        if (open < max) {
            backtrace(res, cur + "(", open+1, close, max);
        }
        if (close <open) {
            backtrace(res, cur + ")", open, close+1, max);
        }
    }
}
