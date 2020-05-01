package com.github.IamBusy.leetcode._025;

import com.github.IamBusy.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void reverseKGroup() {
        ListNode l1 = ListNode.fromArray(1, 2, 3, 4, 5);
        ListNode l2 = ListNode.fromArray(2, 1, 4, 3, 5);
        ListNode l3 = ListNode.fromArray(3, 2, 1, 4, 5);
        assertEquals(solution.reverseKGroup(l1, 2), l2);
    }
}