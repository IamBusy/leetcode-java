package com.github.IamBusy.leetcode._009;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void isMatch() {
        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("aab", "c*a*b"));
        assertFalse(solution.isMatch("aa", "a"));
        assertTrue(solution.isMatch("bbbba", ".*a*a"));
        assertFalse(solution.isMatch("aaaaaaaaaaaaab","a*a*a*a*a*a*a*a*a*a*c"));
        assertTrue(solution.isMatch("","a*a*a*a*a*a*a*a*a*a*"));

    }
}