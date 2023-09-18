package org.example.solution.programers.lv2.p42583;

/**
 * 다리를 지나는 트럭
 * bridge_length = 최대 트럭 대수 합 ( 1 ~ 10,000 )
 * weight = 최대 트럭 무게 합 ( 1 ~ 10,000 )
 * truck_weights size ( 1 ~ 10,000 )
 * index ( 1 ~ weight )
 */

import java.util.*;

public class Solution_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> Q = new LinkedList<>();
        int[] T = truck_weights;
        int answer = 0, W = weight;

        for (int i = 0; i < T.length; i++) {
            answer++;

            if (Q.size() == bridge_length)
                W += Q.poll();

            if (T[i] <= W) {
                W -= T[i];
                Q.add(T[i]);
            } else {
                Q.add(0);
                i--;
            }
        }
        return answer + bridge_length;
    }
}
