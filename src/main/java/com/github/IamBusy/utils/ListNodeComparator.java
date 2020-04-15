package com.github.IamBusy.utils;

import java.util.Comparator;

public class ListNodeComparator implements Comparator<ListNode> {
    public int compare(ListNode o1, ListNode o2) {
        while (o1 != null && o2 != null) {
            if (o1.val != o2.val) {
                return o1.val - o2.val;
            }
            o1 = o1.next;
            o2 = o2.next;
        }
        if (o1 == null) {
            if (o2 == null) return 0;
            else return -1;
        } else {
            return 1;
        }
    }
}
