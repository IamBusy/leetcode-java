package com.github.IamBusy.leetcode._014;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void longestCommonPrefix() {
        assertEquals(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
        assertEquals(solution.longestCommonPrefix(new String[]{ "dog","racecar","car"}), "");

    }
}