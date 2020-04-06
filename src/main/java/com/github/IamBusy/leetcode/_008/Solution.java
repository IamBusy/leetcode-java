package com.github.IamBusy.leetcode._008;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reversed = 0;
        int ori = x;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed == ori;
    }

    public boolean isPalindromeOpt(int x) {
        if (x < 0 || (x % 10 == 0 && x > 0)) return false;
        int reversed = 0;
        while (reversed < x) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed == x || reversed / 10 == x;
    }


}
