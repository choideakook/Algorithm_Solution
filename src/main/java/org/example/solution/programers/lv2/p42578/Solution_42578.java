package org.example.solution.programers.lv2.p42578;

/**
 * 의상
 * clothes[의상 명][의상 종류] ( 1 ~ 30 )
 * index ( 1 ~ 20 / 'a' - 'z' , '_')
 */
import java.util.*;

public class Solution_42578 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;

        for (int i = 0; i < clothes.length; i++) {
            if (map.containsKey(clothes[i][1]))
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            else
                map.put(clothes[i][1], 2);
        }
        for (Integer count : map.values())
            answer *= count;

        return answer - 1;
    }
}
