package org.example.solution.programers.lv2.p132265;

/**
 * 롤케이크 자르기
 * topping ( 1 ~ 1,000,000 )
 * index ( 1 ~ 10,000 )
 */

import java.util.*;

public class Solution_132265 {
    public int solution(int[] topping) {
        Map<Integer, Integer> R = new HashMap<>();
        Map<Integer, Integer> L = new HashMap<>();

        R.put(topping[0], 1);
        for (int i = 1; i < topping.length; i++) putIndex(L, topping[i]);

        int answer = 0;
        for (int i = 1; i < topping.length; i++) {
            answer += R.size() == L.size() ? 1 : 0;
            putIndex(R, topping[i]);
            removeIndex(L, topping[i]);
        }
        return answer;
    }

    void putIndex(Map<Integer, Integer> map, int key) {
        if (map.containsKey(key)) map.put(key, map.get(key) + 1);
        else map.put(key, 1);
    }
    void removeIndex(Map<Integer, Integer> map, int key) {
        if (map.get(key) == 1) map.remove(key);
        else map.put(key, map.get(key) - 1);
    }
}
