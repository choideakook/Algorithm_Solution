package org.example.solution.programers.lv2.p154539;

/**
 * 뒤에 있는 큰 수 찾기
 * numbers ( 4 ~ 1,000,000 )
 * index ( 1 ~ 1,000,000 )
 */

import java.util.*;

public class Solution_154539 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < answer.length; i++) {

            while (!stack.isEmpty() && stack.peek()[0] < numbers[i]) {
                int[] pop = stack.pop();
                answer[pop[1]] = numbers[i];
            }
            stack.add(new int[]{numbers[i], i});
        }

        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            answer[pop[1]] = -1;
        }
        return answer;
    }
}
