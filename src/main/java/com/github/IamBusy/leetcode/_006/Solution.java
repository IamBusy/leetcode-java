package com.github.IamBusy.leetcode._006;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<numRows; i++) {
            for (int j = i; j<s.length(); j+=numRows*2 - 2) {
                sb.append(s.charAt(j));
                if (i > 0 && i< numRows-1 && j + 2*(numRows - (i + 1)) < s.length()) {
                    sb.append(s.charAt(j + 2*(numRows - (i + 1))));
                }
            }
        }
        return sb.toString();
    }

    public String convert2(String s, int numRows) {
        if (numRows <= 1) return s;
        List<StringBuilder> sbs = new ArrayList<StringBuilder>(numRows);
        for (int i = 0; i< numRows; i++) {
            sbs.add(new StringBuilder());
        }
        int direction = 1;
        int sbIdx = 0;
        for (int i = 0; i<s.length(); i++) {
            sbs.get(sbIdx).append(s.charAt(i));
            sbIdx += direction;
            if (sbIdx == 0 || sbIdx == numRows - 1) {
                direction = 0 - direction;
            }
        }
        for (int i=1; i<numRows; i++) {
            sbs.get(0).append(sbs.get(i));
        }
        return sbs.get(0).toString();

    }

}

