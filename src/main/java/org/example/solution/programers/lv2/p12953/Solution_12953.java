package org.example.solution.programers.lv2.p12953;

/**
 * N 개의 최소공배수
 * arr ( 1 ~ 15 )
 * index ( 1 ~ 100 )
 */

import java.util.*;

public class Solution_12953 {
    public int solution(int[] arr) {
        int max = arr.length - 1;
        Arrays.sort(arr);

        int i = 1;
        while (true) {
            int num = arr[max] * i;
            i++;

            for (int j = max - 1; j >= 0; j--)
                if (num % arr[j] != 0) break;
                else if (j == 0) return num;
        }
    }
}