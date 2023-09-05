package org.example.solution.programers.lv2.p42587;

/**
 * 프로세스
 * priorities (1 ~ 100)
 * index ( 1 ~ 9 )
 * location = target ( 0 ~ priorities length - 1 )
 */

import java.util.*;

public class Solution_42587 {
    ArrayList<Integer>[] list = new ArrayList[10];

    public int solution(int[] priorities, int location) {
        for (int i = 1; i < list.length; i++) list[i] = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) list[priorities[i]].add(i);

        int start = 0;
        int answer = 0;
        for (int i = 9; i > 0; i--)
            if (list[i].size() > 0) {
                sort(i, start);

                for (int j = 0; j < list[i].size(); j++) {
                    answer++;
                    if (list[i].get(j) == location) return answer;
                }
                start = list[i].get(list[i].size() - 1);
            }
        return answer;
    }
    void sort(int i, int start) {
        Collections.sort(list[i], new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a >= start && b >= start)
                    return a.compareTo(b);
                else if (a < start && b < start)
                    return a.compareTo(b);
                else
                    return b.compareTo(a);
            }
        });
    }
}

