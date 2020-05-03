package com.github.IamBusy.leetcode._026;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int lo=0, hi=1,uniq=1;
        while (hi<nums.length) {
            if (nums[lo] == nums[hi]) {
                hi++;
            } else {
                nums[++lo] = nums[hi++];
                uniq++;
            }
        }
        return uniq;
    }
}
