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
}