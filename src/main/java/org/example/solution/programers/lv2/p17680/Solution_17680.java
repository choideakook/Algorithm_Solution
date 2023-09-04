package org.example.solution.programers.lv2.p17680;

/**
 * [1차] 캐시
 * cacheSize ( 1 ~ 30 )
 * cities ( ~ 100,000 )
 */

import java.util.*;

public class Solution_17680 {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> Q = new LinkedList<>();
        int answer = 0;

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            if (Q.contains(city)) answer++;
            else answer += 5;

            Q.add(city);
            if (Q.size() > cacheSize) Q.poll();
        }
        return answer;
    }
}
