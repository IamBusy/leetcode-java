package com.github.IamBusy.leetcode._025;

import com.github.IamBusy.utils.ListNode;

import java.util.Stack;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        return reverseKGroupOpt(head, k);
    }

    public ListNode reverseKGroup1(ListNode head, int k) {
        Stack<ListNode> st = new Stack<ListNode>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        boolean flag = false;
        while (!flag) {
            ListNode h = cur;
            for (int i=0; i<k; i++) {
                if (cur.next != null) {
                    st.push(cur.next);
                    cur = cur.next;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ListNode nextGroupHead = cur.next;
                ListNode curGroup= st.pop();
                h.next = curGroup;
                while (!st.empty()) {
                    curGroup.next = st.pop();
                    curGroup = curGroup.next;
                }
                curGroup.next = nextGroupHead;
                cur = curGroup;
            }

        }
        return dummy.next;
    }


    public ListNode reverseKGroupOpt(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        boolean flag = false;
        while (!flag) {
            ListNode iter = cur.next;
            for (int i=0; i<k; i++) {
                if (iter == null) {
                    return dummy.next;
                }
                iter = iter.next;
            }

            ListNode lastGroupTail = cur;
            cur = cur.next;
            ListNode thisGroupTail = cur;
            ListNode last = null;
            for (int i=0; i<k; i++) {
                if (cur != null) {
                    ListNode tmp = cur.next;
                    cur.next = last;
                    last = cur;
                    cur = tmp;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                lastGroupTail.next = last;
                thisGroupTail.next = cur;
                cur = thisGroupTail;
            }
        }
        return dummy.next;
    }
}
