package org.example.solution.programers.lv2.p131701;

/**
 * 연속 부분 수열 합의 개수
 * elements ( 3 ~ 1,000 )
 * element ( 1 ~ 1,000 )
 */
import java.util.*;

public class Solution_131701 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
            arr[i + elements.length] = elements[i];
        }

        for (int i = 0; i < elements.length; i++) {
            int sum = elements[i];
            set.add(sum);

            for (int j = i + 1; j < i + elements.length; j++) {
                sum += arr[j];
                set.add(sum);
            }
        }

        return set.size();
    }
}
