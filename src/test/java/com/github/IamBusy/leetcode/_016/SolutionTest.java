package com.github.IamBusy.leetcode._016;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void threeSumClosest() {
        assertEquals(solution.threeSumClosest(new int[]{-1,2,1,-4}, 1), 2);
    }
}