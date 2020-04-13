package com.github.IamBusy.leetcode._016;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bias = Integer.MAX_VALUE;
        int res = 0;
        for (int i=0; i<nums.length-2; i++) {
            int tgtSum = target - nums[i];
            int lo = i+1, hi = nums.length-1;
            while (lo<hi) {
                int twoSum = nums[lo] + nums[hi];
                if (Math.abs(tgtSum-twoSum) < bias) {
                    bias = Math.abs(tgtSum-twoSum);
                    res = nums[i] + twoSum;
                }
                if (twoSum == tgtSum) {
                    return target;
                } else if (twoSum < tgtSum) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return res;
    }
}
