package com.github.IamBusy.leetcode._019;

import com.github.IamBusy.utils.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode vir = new ListNode(0);
        vir.next = head;
        ListNode toBeDeleted = vir, cur = vir;
        for (int i=0; i<=n; i++) {
            cur = cur.next;
        }
        while (cur != null) {
            cur = cur.next;
            toBeDeleted = toBeDeleted.next;
        }
        toBeDeleted.next = (toBeDeleted.next == null? null: toBeDeleted.next.next);
        return vir.next;
    }
}
