package com.github.IamBusy.leetcode._008;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void isPalindrome() {
        assertFalse(solution.isPalindrome(10));
        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(-121));
    }
}