package com.github.IamBusy.leetcode._020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void isValid() {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
    }
}
