package org.example.solution.programers.lv2.p87946;

/**
 * 피로도
 * k = user 피로도 ( 1 ~ 5,000 )
 * dungeons[1 ~ 8][2] {최소 , 소모} ( 최소 >= 소모 / 1 ~ 1,000 )
 */

import java.util.*;

public class Solution_87946 {
    public int solution(int k, int[][] dungeons) {
        Arrays.sort(dungeons, new Comparator<int[]>() {
           @Override
           public int compare(int[] a, int[] b){
               int A = a[0] - a[1];
               int B = b[0] - b[1];
               if (A == B)
                   return a[1] - b[1];
               return B - A;
           }
        });
        int answer = 0;
        for (int[] i : dungeons) {
            if (k >= i[0]) {
                k -= i[1];
                answer++;
            }
            if (k == 0) break;
        }
        return answer;
    }
}
