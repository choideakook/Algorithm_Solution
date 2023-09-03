package org.example.solution.programers.lv2.p42747;

/**
 * H-Index
 * n = length ( 1 ~ 1,000 )
 * index ( 0 ~ 10,000 )
 */

import java.util.*;

public class Solution_42747 {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;

        for (int over = 1; over <= length; over++) {
            int index = length - over;
            int under = index + 1;

            if (citations[index] <= over && citations[index] >= under)
                return citations[index];
        }
        return 0;
    }
}
