package com.github.IamBusy.leetcode._020;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')') {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }

            } else if (c == ']') {
                if (!st.empty() && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                if (!st.empty() && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public boolean isValidOpt(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(')');
            } else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (st.empty() || st.pop() != c) {
                return false;
            }
        }
        return st.empty();
    }
}
