package com.github.IamBusy.leetcode._023;

import com.github.IamBusy.utils.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode  dummp = new ListNode(0);
        ListNode cur = dummp;
        boolean finished = false;
        while (!finished) {
            finished = true;
            ListNode nextNode = new ListNode(Integer.MAX_VALUE);
            int idx = -1;
            for (int i=0; i<lists.length; i++) {
                if (lists[i] != null) {
                    finished = false;
                    if (lists[i].val < nextNode.val) {
                        nextNode = lists[i];
                        idx = i;
                    }
                }
            }
            if (!finished) {
                cur.next = nextNode;
                cur = cur.next;
                if (idx >= 0) {
                    lists[idx] = lists[idx].next;
                }
            }
        }
        return dummp.next;
    }
}
