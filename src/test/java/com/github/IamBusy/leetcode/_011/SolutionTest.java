package com.github.IamBusy.leetcode._011;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void maxArea() {
        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}