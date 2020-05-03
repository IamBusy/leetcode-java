package com.github.IamBusy.leetcode._027;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int lo=0, hi=0, valLen = 0;
        while (hi<nums.length) {
            if (nums[hi] != val) {
                nums[lo++] = nums[hi++];
                valLen++;
            } else {
                hi++;
            }
        }
        return valLen;
    }
}
