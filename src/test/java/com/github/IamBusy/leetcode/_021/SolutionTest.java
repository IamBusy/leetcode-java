package com.github.IamBusy.leetcode._021;

import com.github.IamBusy.utils.ListNode;
import com.github.IamBusy.utils.ListNodeComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode tester = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        assertEquals(new ListNodeComparator().compare(solution.mergeTwoLists(l1, l2), tester), 0);
    }
}