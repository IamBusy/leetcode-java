package com.github.IamBusy.leetcode._019;

import com.github.IamBusy.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void removeNthFromEnd() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode target = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        ListNode tester = solution.removeNthFromEnd(head, 2);
        while (target.next!=null) {
            assertNotNull(tester);
            assertEquals(tester.val, target.val);
            target = target.next;
            tester = tester.next;
        }

        head = new ListNode(1);
        assertNull(solution.removeNthFromEnd(head, 1));
    }
}