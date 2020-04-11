package com.github.IamBusy.leetcode._011;

public class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int maxS = 0, tmpS;
        while (i<j) {
            if (height[i] < height[j]) {
                tmpS = (j-i) * height[i];
                i++;
            } else {
                tmpS = (j-i) * height[j];
                j--;
            }
            maxS = Math.max(maxS, tmpS);
        }
        return maxS;
    }
}
