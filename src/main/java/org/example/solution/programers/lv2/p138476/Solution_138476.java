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
        int[] count = new int[100001];

        for (int i = 0; i < tangerine.length; i++) {
            int TG = tangerine[i];
            count[TG]++;
            if (count[TG] == k) return 1;
        }
        Arrays.sort(count);

        int sum = 0;
        int answer = 0;
        for (int i = 100000; i >= 0; i--) {
            answer++;
            sum += count[i];
            if (sum >= k) break;
        }

        return answer;
    }
}
