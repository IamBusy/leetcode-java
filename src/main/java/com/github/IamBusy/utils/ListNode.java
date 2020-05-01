package com.github.IamBusy.utils;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode(int x, ListNode n) {
        val = x;
        next = n;
    }

    public static ListNode fromArray(int ...vals) {
        if (vals.length == 0) {
            return null;
        }
        ListNode head = new ListNode(vals[0]);
        ListNode cur = head;
        for (int i=1; i<vals.length; i++) {
            cur.next = new ListNode(vals[i]);
            cur = cur.next;
        }
        return head;
    }

    public static ListNode copyFrom(ListNode l1) {
        ListNode cur = l1;
        ListNode dummy = new ListNode(0);
        ListNode newCur = dummy;
        while (cur!=null) {
            newCur.next = new ListNode(cur.val);
            cur = cur.next;
            newCur = newCur.next;
        }
        return dummy.next;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof ListNode)) {
            return false;
        }
        return (new ListNodeComparator()).compare(this, (ListNode) obj) == 0;
    }
}