package com.github.IamBusy.leetcode._023;

import com.github.IamBusy.utils.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return divideAndConquer(lists);
    }

    public ListNode normal(ListNode[] lists) {
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

    public ListNode divideAndConquer(ListNode[] lists) {
        if (lists.length == 0) return null;
        return divide(lists, 0, lists.length-1);
    }

    private ListNode divide(ListNode[] lists, int lo, int hi) {
        if (lo == hi) {
            return lists[lo];
        } else if (hi == lo + 1) {
            return conquer(lists[lo], lists[hi]);
        } else {
            ListNode left = divide(lists, lo, (lo+hi)/2);
            ListNode right = divide(lists, (lo+hi)/2+1, hi);
            return conquer(left, right);
        }
    }

    private ListNode conquer(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }
        return dummy.next;
    }
}
