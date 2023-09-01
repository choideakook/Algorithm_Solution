package org.example.solution.programers.lv2.p138476;

/**
 * 귤 고르기
 * K = pick size ( 1 ~ tangerine )
 * tangerine = total length ( K ~ 100,000 )
 * index ( 1 ~ 10,000,000 )
 */

import java.util.*;

public class Solution_138476 {
    public int solution(int k, int[] tangerine) {
        long[] count = new long[10000001];

        for (int i = 0; i < tangerine.length; i++) {
            int TG = tangerine[i];
            count[TG]++;
            if (count[TG] == k) return 1;
        }
        Arrays.sort(count);

        long sum = 0;
        int answer = 0;
        for (int i = 10000000; i >= 0; i--) {
            answer++;
            sum += count[i];
            if (sum >= k) break;
        }
        return answer;
    }
}
