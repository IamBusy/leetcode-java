package com.github.IamBusy.leetcode._024;

import com.github.IamBusy.utils.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fst = dummy, cur = head.next;
        while (cur!=null) {
            ListNode tmp = fst.next;
            ListNode tail = cur.next;
            fst.next.next = cur.next;
            fst.next = cur;
            cur.next = tmp;
            cur = tail;
            if (cur != null) {
                cur = cur.next;
                fst = tmp;
            }
        }
        return dummy.next;
    }
}
