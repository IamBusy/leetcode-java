package com.github.IamBusy.leetcode._024;

import com.github.IamBusy.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void swapPairs() {
        ListNode l1 = ListNode.fromArray(1, 2, 3, 4);
        ListNode l2 = ListNode.fromArray(2, 1, 4, 3);
        assertEquals(l2, solution.swapPairs(l1));
    }
}