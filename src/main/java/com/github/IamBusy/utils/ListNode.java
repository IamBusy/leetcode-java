package com.github.IamBusy.utils;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode(int x, ListNode n) {
        val = x;
        next = n;
    }
}