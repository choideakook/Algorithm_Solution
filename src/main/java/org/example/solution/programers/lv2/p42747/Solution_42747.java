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
        int pointer = citations.length;
        int index = pointer - 1;
        int over = 0;

        while (true) {
            if (over >= pointer && index <= pointer)
                return pointer;
            else if(citations[index] >= pointer) {
                index--;
                over++;
            }
            else if (citations[index] < pointer) pointer --;
        }
    }
}
