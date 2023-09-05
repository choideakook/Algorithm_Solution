package org.example.solution.programers.lv2.p42586;

/**
 * 기능 개발
 * progresses ( 0 ~ 100 )
 * speeds ( 0 ~ 100 )
 * index ( 1 ~ 100 )
 */
import java.util.*;

public class Solution_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] dDay = new int[speeds.length];
        int count = 0;
        int max = 0;

        for (int i = 0; i < speeds.length; i++) {
            int rest = 100 - progresses[i];
            dDay[i] = rest / speeds[i];
            dDay[i] += (rest % speeds[i] == 0) ? 0 : 1;

            if (max >= dDay[i]) count++;
            else {
                if (max != 0) list.add(count);
                max = dDay[i];
                count = 1;
            }
        }
        list.add(count);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
