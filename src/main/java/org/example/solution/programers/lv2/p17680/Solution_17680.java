package org.example.solution.programers.lv2.p17680;

/**
 * [1차] 캐시
 * cacheSize ( 1 ~ 30 )
 * cities ( ~ 100,000 )
 */

import java.util.*;

public class Solution_17680 {
    public int solution(int cacheSize, String[] cities) {
        ArrayList<String> list = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();

            if (list.contains(city)) {
                answer++;
                list.remove(city);
            }
            else answer += 5;

            list.add(city);
            if (list.size() > cacheSize)
                list.remove(0);
        }
        return answer;
    }
}
