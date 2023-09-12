package org.example.solution.programers.lv2.p42584;

/**
 * 주식가격
 * price ( 2 ~ 100,000 )
 * index ( 1 ~ 10,000 )
 */

import java.util.*;

public class Solution_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            if (stack.isEmpty() || stack.peek()[0] <= prices[i]) {
                stack.add(new int[]{prices[i], i});
            }
            else if (stack.peek()[0] > prices[i]) {
                while (!stack.isEmpty() &&stack.peek()[0] > prices[i]) {
                    int[] pop = stack.pop();
                    answer[pop[1]] = i - pop[1];
                }
                stack.add(new int[]{prices[i], i});
            }
        }
        while (!stack.isEmpty()) {
            int len = prices.length - 1;
            int[] pop = stack.pop();
            answer[pop[1]] = len - pop[1];
        }
        return answer;
    }
}
