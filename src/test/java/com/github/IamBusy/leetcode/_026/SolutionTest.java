package com.github.IamBusy.leetcode._026;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void removeDuplicates() {
        int []arr1 = new int[]{1, 1, 2};
        assertEquals(2, solution.removeDuplicates(arr1));
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOf(arr1, 2));
    }
}