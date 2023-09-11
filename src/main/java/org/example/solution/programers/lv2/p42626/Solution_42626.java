package org.example.solution.programers.lv2.p42626;

/**
 * 더 맵게
 * scoville ( 2 ~ 1,000,000 )
 * k = target ( 0 ~ 1,000,000,000 )
 * mix = i[n] + i[n - 1] * 2;
 */

import java.util.*;

public class Solution_42626 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) Q.add(scoville[i]);

        int answer = 0;
        while (Q.peek() < K) {
            try {
                Q.add(Q.poll() + (Q.poll() * 2));
                answer++;
            }catch (Exception e){
                return -1;
            }
        }
        return answer;
    }
}
