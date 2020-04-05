package com.github.IamBusy.leetcode._007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void reverse() {
        assertEquals(321, solution.reverse(123));
        assertEquals(0, solution.reverse(0));
        assertEquals(-2541, solution.reverse(-1452));
        assertEquals(21, solution.reverse(120));
        assertEquals(-21, solution.reverse(-120));
        assertEquals(0, solution.reverse(1534236469));
    }
}