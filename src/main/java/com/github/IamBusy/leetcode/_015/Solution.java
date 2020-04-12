package com.github.IamBusy.leetcode._015;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        for (int i=0; i<nums.length-2; i++) {
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = -nums[i];
            int lo = i+1, hi = nums.length-1;
            while (lo < hi) {
                if (nums[lo] + nums[hi] == target) {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                    while (lo < hi && nums[hi-1] == nums[hi]) hi--;
                    lo++;
                    hi--;
                } else if (nums[lo] + nums[hi] < target) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return res;
    }

//    public List<List<Integer>> threeSumMap(int[] nums) {
//        List<List<Integer>> res = new LinkedList<List<Integer>>();
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i=0; i<nums.length; i++) {
//            Integer fre = map.get(nums[i]);
//            if (fre == null) {
//                map.put(nums[i], 1);
//            } else {
//                map.put(nums[i], fre+1);
//            }
//        }
//        Integer target, fre;
//        for (int i=0; i<nums.length; i++) {
//            for (int j = i+1; j<nums.length; j++) {
//                target = 0 - nums[i] - nums[j];
//                fre = map.get(target);
//                if (fre != null) {
//                    if ((target == nums[i] || target == nums[j])) {
//                        if (fre >= 2) {
//                            res.add(Arrays.asList(nums[i], nums[j], target));
//                        }
//                    } else {
//                        res.add(Arrays.asList(nums[i], nums[j], target));
//                    }
//                }
//            }
//        }
//        return res;
//    }
}
