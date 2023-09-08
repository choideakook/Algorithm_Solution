package org.example.solution.programers.lv2.p17684;

/**
 * 압축
 * msg ( 1 ~ 1,000 )
 */
import java.util.*;

public class Solution_17684 {
    public int[] solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            String key = String.valueOf((char) ('A' + i));
            map.put(key, i + 1);
        }

        for (int i = 0; i < msg.length(); i++) {
            String key = String.valueOf(msg.charAt(i));
            int add = -1;
            int value = 0;

            while (map.containsKey(key)) {
                value = map.get(key);
                if (msg.length() == i + 2 + add) {
                    answer.add(value);
                    return answer.stream().mapToInt(Integer::intValue).toArray();
                }
                key += String.valueOf(msg.charAt(i + 2 + add));
                add++;
            }
            map.put(key, map.size() + 1);
            answer.add(value);
            i += add;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
