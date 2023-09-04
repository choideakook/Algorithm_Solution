package org.example.solution.programers.lv2.p64065;

/**
 * 튜플
 * s = array ( 5 ~ 1,000,000 )
 * index ( 1  ~ 100,000 )
 * return length ( 1 ~ 500 )
 */

import java.util.*;

public class Solution_64065 {
    public int[] solution(String s) {
        String[] split = s.substring(2, s.length() - 2).split("},\\{");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            String[] index = split[i].split(",");

            for (int j = 0; j < index.length; j++)
                if (map.containsKey(index[j]))
                    map.put(index[j], map.get(index[j]) + 1);
                else
                    map.put(index[j], 1);
        }

        int[][] arr = new int[map.size()][2];
        int i = 0;
        for (String key : map.keySet()) {
            int index = Integer.parseInt(key);
            arr[i][0] = index;
            arr[i][1] = map.get(key);
            i++;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int[] answer = new int[map.size()];
        for (int j = 0; j < answer.length; j++)
            answer[j] = arr[j][0];

        return answer;
    }
}