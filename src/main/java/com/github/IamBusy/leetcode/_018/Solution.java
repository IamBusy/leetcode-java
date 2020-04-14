package com.github.IamBusy.leetcode._018;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        for (int i=0; i<nums.length-3; i++) {
            for (int j=i+1; j<nums.length-2; j++) {
                int lo = j+1, hi = nums.length-1;
                int preTwoSum = nums[i] + nums[j];
                while (lo<hi) {
                    int s = preTwoSum + nums[lo] + nums[hi];
                    if (s < target) {
                        lo++;
                    } else if(s > target) {
                        hi--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        while (lo<hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo<hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    }
                }
                while (j<nums.length-2 && nums[j+1] == nums[j]) j++;
            }
            while (i<nums.length-3 && nums[i+1] == nums[i]) i++;
        }
        return res;
    }
}
