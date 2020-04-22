package com.github.IamBusy.leetcode._023;

import com.github.IamBusy.utils.ListNode;
import com.github.IamBusy.utils.ListNodeComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mergeKLists() {
        ListNode l1 = ListNode.fromArray(1, 4, 5);
        ListNode l2 = ListNode.fromArray(1, 3, 4);
        ListNode l3 = ListNode.fromArray(2, 6);
        ListNode res = ListNode.fromArray(1,1,2,3,4,4,5,6);
        assertEquals(new ListNodeComparator().compare(solution.mergeKLists(new ListNode[]{l1, l2, l3}), res), 0);
    }
}