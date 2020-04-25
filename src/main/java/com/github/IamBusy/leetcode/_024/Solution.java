package com.github.IamBusy.leetcode._024;

import com.github.IamBusy.utils.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode fst = cur.next;
            ListNode sec = cur.next.next;
            ListNode tail = cur.next.next.next;
            cur.next = sec;
            fst.next = tail;
            sec.next = fst;
            cur = fst;
        }
        return dummy.next;
    }
}
